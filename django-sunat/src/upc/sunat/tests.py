__author__ = 'herald olivares'

from django.test import TestCase
from upc.sunat.models import Person, Concept

class ConceptTestCase(TestCase):
    def setUp(self):
        Concept.objects.create(name="concept1")
        Concept.objects.create(name="concept2")

    def test_concept_crud(self):
        """Animals that can speak are correctly identified"""
        concept1 = Concept.objects.get(name="concept1")
        concept2 = Concept.objects.get(name="concept2")
        self.assertEqual(concept1.name, 'concept1')
        self.assertEqual(concept2.name, 'concept2')

class PersonTestCase(TestCase):
    def setUp(self):
        Person.objects.create(name='Juan', type=1, ruc="12345678987", phone="5678998")
        Person.objects.create(name='PCM', type=1, ruc="23456789021", phone="342434")

    def test_person_crud(self):
        self.assertEqual(Person.objects.count(), 2)
        person1 = Person.objects.get(pk=1)
        person2 = Person.objects.get(pk=2)
        self.assertEqual(person1.ruc, '12345678987')
        self.assertEqual(person2.ruc, '23456789021')