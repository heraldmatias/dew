__author__ = 'herald olivares'
# -*- coding: utf-8 -*-

from django.contrib import admin
from upc.sunat.models import Person, Concept, Debt

class PersonAdmin(admin.ModelAdmin):
    pass

class ConceptAdmin(admin.ModelAdmin):
    pass

class DebtAdmin(admin.ModelAdmin):
    pass

admin.site.register(Person, PersonAdmin)
admin.site.register(Concept, ConceptAdmin)
admin.site.register(Debt, DebtAdmin)


