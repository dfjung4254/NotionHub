from django.urls import path
from . import views

urlpatterns = [
    path('<int:userId>', views.index.as_view(), name='index'),
    path('', views.index.as_view(), name='index')
]