from django.urls import path
from . import views

urlpatterns = [
    path('', views.index.as_view(), name='index'),
    path('<int:id>/', views.detail.as_view(), name='detail') # url parameter
]