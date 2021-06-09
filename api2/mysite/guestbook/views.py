import json
from django.views import View
from django.http import HttpResponse, JsonResponse
from django.core import serializers # 모델(쿼리셋)을 JSON 타입으로 데이터 직렬화
from .models import Post


class index(View):
    def get(self, request):
        data = serializers.serialize('json',Post.objects.all())
        return HttpResponse(data, content_type="application/json")

    def post(self, request):
        if request.META['CONTENT_TYPE'] == "application/json":
            request = json.loads(request.body)
            data = Post(title = request['title'],
                        content = request['content'])
        else:
            data = Post(title = request.POST['title'],
                        content = request.POST['content'])
        data.save()
        return HttpResponse("저장되었습니다.")


class detail(View):
    def get(self,request,id):
        if id == 1:
            data = serializers.serialize('json',Post.objects.filter(id=1))
            return HttpResponse(data, content_type="application/json")
        else:
            return HttpResponse("Error: 유효하지 않은 접근입니다.")