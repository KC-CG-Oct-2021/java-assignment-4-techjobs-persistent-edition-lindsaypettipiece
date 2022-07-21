package org.launchcode.techjobs.persistent.models;

import org.springframework.core.convert.Property;

import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

 @OneToMany
 @JoinColumn(name = "employer_id")
 private final List<Job> jobs = new ArrayList<>();

 @NotNull
 @Size(max = 100)
 public String location;

 public Employer(){
 }

 public Employer(String location) {
  this.location = location;
 }

 public String getLocation() {
  return location;
 }

 public void setLocation(String location) {
  this.location = location;
 }

 public List<Job> getJobs() {
  return jobs;
 }
}
