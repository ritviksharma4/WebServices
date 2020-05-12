
from django.contrib import admin
from django.urls import path,include

#Include main file

urlpatterns = [
    path('',include('housing_prediction_service.urls')),
    path('admin/', admin.site.urls),
]
