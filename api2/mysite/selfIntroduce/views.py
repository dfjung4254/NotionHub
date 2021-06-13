import json
from django.views import View
from django.http import HttpResponse, JsonResponse
from django.core import serializers
from .models import selfIntroduce

class index(View):
    def get(self, request):
        userId = request.headers['userId']
        data = serializers.serialize('json',selfIntroduce.objects.filter(userId=userId))
        return HttpResponse(data)

    def post(self, request):
        if request.content_type == 'application/json':
            userId = request.headers['userId']
            request = json.loads(request.body)
            data = selfIntroduce(userId = userId,
                                 userImage = request['userImage'],
                                 subject = request['subject'],
                                 content = request['content'])
            data.save()
            return HttpResponse("저장되었습니다.")
        else:
            return HttpResponse("잘못된 요청입니다.")