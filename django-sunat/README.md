Django - Sunat
==============

1.- Requerimientos

    Python 2.6 - 2.7
    Recomendación python 2.7.5
    aqui el link de descarga, no olvide elegir el que este acorde a la arquitectura de su sistema operativo
    http://www.python.org/download/releases/2.7.5/

    Mysql 5

    Mysql - python
    no olvide seleccionar el que este acorde a la arquitectura
    http://www.codegood.com/archives/129

Todos los comandos a continuacion hagalos desde una terminal

1.- Instalamos setuptools para poder trabajar con buildout

    python ez_setup.py

2.- accedemos al directorio del proyecto

3.- ejecutamos la siguiente instruccion

    python bootstrap.py -t --allow-site-packages

3.- ejecutamos la siguiente instruccion

    bin/buildout -vvv

4.- Modificar la seccion databases del archivo project/development.py con los datos de su servidor mysql

    DATABASES = {
        'default': {
            'ENGINE': 'django.db.backends.mysql', # Motor
            'NAME': 'sunat' ,                      # Nombre de la base de datos
            'USER': 'root',                      # Usuario
            'PASSWORD': '',                  # Contraseña
            'HOST': '',                      # Host, se asume localhost por default
            'PORT': '',                      # Puerto, se asume el puerto por default segun el motor
        }
    }

5.- Sincronizar a la base de datos

    bin/django syncdb