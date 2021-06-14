from django.db import models

class selfIntroduce(models.Model):
    userId = models.BigIntegerField(primary_key=True)
    userImage = models.URLField(max_length=2000)
    subject = models.CharField(max_length=20)
    content = models.CharField(max_length=100)