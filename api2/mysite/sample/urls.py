from django.urls import path
from . import views

urlpatterns = [
    path('', views.index, name='index')
    # arg1 : 도메인 형식
    # arg2 : render해줄 페이지
    # arg3 : name
]