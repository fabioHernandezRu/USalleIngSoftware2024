from django.shortcuts import render

# Create your views here.
from django.shortcuts import render
from .models import User
# "Controller"
def show_users(request):
    users = User.objects.all()
    return render(request, 'users.html', {'users': users})