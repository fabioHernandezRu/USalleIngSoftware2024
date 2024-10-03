Aquí tienes un ejemplo de un archivo **README.md** que puedes usar para explicar los pasos en tu clase de Django. Este README detalla cómo ejecutar el proyecto de Django que implementa el patrón MVT (Modelo Vista Template).

---

# Django MVT Example

Este proyecto demuestra cómo Django implementa el patrón MVT (Modelo Vista Template) en una aplicación sencilla de lista de usuarios.

## Requisitos previos

- Python 3.x
- Pip
- Django (puedes instalarlo usando `pip install django`)
- Base de datos SQLite (viene por defecto en Django)

## Pasos para configurar y ejecutar el proyecto

### 1. Crear un nuevo proyecto Django

Primero, crea un nuevo proyecto de Django llamado `myproject`:
```bash
django-admin startproject myproject
cd myproject
```

### 2. Crear una aplicación dentro del proyecto

Dentro del proyecto, crea una aplicación llamada `myapp`:
```bash
python manage.py startapp myapp
```

### 3. Definir el modelo

En `myapp/models.py`, define un modelo llamado `User`:
```python
from django.db import models

class User(models.Model):
    name = models.CharField(max_length=50)
    email = models.EmailField()
```

### 4. Crear la vista

En `myapp/views.py`, define una vista que obtenga los usuarios de la base de datos y los pase a la plantilla:
```python
from django.shortcuts import render
from .models import User

def show_users(request):
    users = User.objects.all()
    return render(request, 'users.html', {'users': users})
```

### 5. Configurar las rutas

En `myapp/urls.py`, define las rutas de la aplicación:
```python
from django.urls import path
from . import views

urlpatterns = [
    path('users/', views.show_users, name='show_users'),
]
```

En `myproject/urls.py`, incluye las rutas de la aplicación:
```python
from django.contrib import admin
from django.urls import include, path

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', include('myapp.urls')),
]
```

### 6. Crear la plantilla

Crea un archivo de plantilla en `myapp/templates/users.html` con el siguiente contenido:
```html
<h1>Lista de usuarios</h1>
<ul>
    {% for user in users %}
        <li>{{ user.name }} - {{ user.email }}</li>
    {% endfor %}
</ul>
```

### 7. Configurar la base de datos

En `myproject/settings.py`, asegúrate de que tu aplicación esté incluida en `INSTALLED_APPS`:
```python
INSTALLED_APPS = [
    # Otras aplicaciones predeterminadas
    'myapp',
]
```

### 8. Aplicar las migraciones

Para aplicar el modelo definido en la base de datos, ejecuta los siguientes comandos:
```bash
python manage.py makemigrations
python manage.py migrate
```

### 9. Ejecutar el servidor de desarrollo

Para probar la aplicación, ejecuta el servidor de desarrollo de Django:
```bash
python manage.py runserver
```

Abre tu navegador y ve a `http://localhost:8000/users/` para ver la lista de usuarios.

---

## Notas adicionales

- Puedes usar el panel de administración de Django para agregar usuarios. Primero, crea un superusuario:
  ```bash
  python manage.py createsuperuser
  ```
- Luego, accede al panel en `http://localhost:8000/admin/` para gestionar los usuarios.

---

Este proyecto demuestra cómo estructurar una aplicación de Django siguiendo el patrón MVT. Puedes extender esta base para agregar más funcionalidades como formularios, autenticación, y más.

---

Este **README.md** te servirá como una guía clara para tus estudiantes sobre cómo configurar y ejecutar un proyecto Django básico utilizando el patrón MVT.