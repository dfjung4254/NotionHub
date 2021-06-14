import json
from django.views import View
from django.http import HttpResponse, JsonResponse
from django.forms.models import model_to_dict
from .models import selfIntroduce

class index(View):
    def get(self, request, userId):
        data = selfIntroduce.objects.get(pk=userId)
        return JsonResponse(model_to_dict(data))

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