__author__ = 'herald olivares'
from django import forms

class SearchDebtForm(forms.Form):
    ruc = forms.CharField(max_length=11, required=True, widget=forms.TextInput(
        attrs={'placeholder' : 'Ingrese el numero de ruc',
               'required': 'required'}
    ))