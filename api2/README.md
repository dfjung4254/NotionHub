## *API 2 (Backend 2)*
***
**Framework** : `Django`/ `Python3`

- 21.6.5 : first commit
- 21.6.6 : Sample App index 추가
```
http://localhost:8000/sample/ 로 클라이언트 요청시
1. setting.py 의 ROOT_URLCONF -> mysite.urls -> urlpatterns 에서 sample/ 매치(앱)
2. sample/urls.py -> 매치된 URL뷰 호출 (sample/urls.py -> views.index 호출)
3. 호출시 HttpRequest 객체를 인자(request)로 넘겨받고 HttpResponse 객체 반환 
```