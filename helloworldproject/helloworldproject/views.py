from django.http import HttpResponse
from django.views.generic import TemplateView


def hello_world_func(request):
    response_object = HttpResponse('<h1>hello world</h1>')
    return response_object


class HelloWorldClass(TemplateView):
    template_name = 'hello.html'
