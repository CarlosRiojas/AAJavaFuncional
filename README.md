# AAJavaFuncional- Job search App

## What did I learned in this course?

Learned about functional programming, where it comes from and how to apply it,in more detailed terms,
I learned what a first class function is, the differences between pure and impure functions and their 
secondary effects, inmutability, I also learned about functional Interfaces,reference operators,
Lambda functions,collectors,Stream listeners,mapping all of this while consuming an API.

## How is this repository structured?

The repository is divided into API and CLI, the whole project is centered in the JobSearch Class, which 
is where the main class is, and on line 39, executeRequest, calls the API and fetches all the jobs based
on a certain criteria, altough the main objective of tha class wasn't to consume the API, it just calls
the All jobs class trough a .flatmap() method, and it's all constructed by good functional programming 
practices.

## Table of contents

* [Job Search](../master/src/main/java/com/platzi/jobsearch/JobSearch.java)
* [Job Position](../master/src/main/java/com/platzi/jobsearch/JobPosition.java)
