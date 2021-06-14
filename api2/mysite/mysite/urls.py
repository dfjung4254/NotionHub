from django.contrib import admin
from django.urls import include,path

urlpatterns = [
    path('sample/', include('sample.urls')),
    path('admin/', admin.site.urls),
    path('guestbook/', include('guestbook.urls')),
    path('guestbook', include('guestbook.urls')),
    path('self-introduce/', include('selfIntroduce.urls')),
    path('self-introduce', include('selfIntroduce.urls'))
]