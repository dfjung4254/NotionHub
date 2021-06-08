import json
from django.views import View
from django.http import HttpResponse, JsonResponse


class index(View):
    def get(self, request):
        return HttpResponse("방명록 페이지입니다.")

    def post(self, request):
        data = json.loads(request.body)
        return JsonResponse(data,json_dumps_params={'ensure_ascii':False})


class detail(View):
    def get(self,request,id):
        if id == 1:
            return JsonResponse({
                'title': '안녕하세요',
                'content': '첫번째 글입니다.'
            }, json_dumps_params={'ensure_ascii': False})
        else:
            return HttpResponse("Error: 유효하지 않은 접근입니다.")