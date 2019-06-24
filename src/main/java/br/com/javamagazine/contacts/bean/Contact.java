package br.com.javamagazine.contacts.bean;

import java.util.ArrayList;
import java.util.List;
  
public class Contact {
  
 private int id;
 private String name;
 private List<Phone> phones = new ArrayList<Phone>();
 private List<Email> emails = new ArrayList<Email>();
  
 // gets e sets omitidos...
  
 @Override
 public boolean equals(Object obj) {
  boolean result = false;
  
  if (obj instanceof Contact) {
   Contact c = (Contact) obj;
   result = c.getId() == this.getId();
  }
  
  return result;
 }
  
 @Override
 public int hashCode() {
  return getId() ^ 7;
 }
}