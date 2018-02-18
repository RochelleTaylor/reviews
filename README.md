# reviews

Create/configure a Spring Boot/MVC application.
Create a Review class for the content of reviews. Its instance variables (attributes) should include:
id (make this of type long – you’ll find out why later) – just use arbitrary, unique numbers for these ids
title
image url
review category
content
whatever other things you’d like to include. Some ideas:
date
description/synopsis
Stretch Task: tags (this should probably be a Collection)
accessor (get* methods) that return information about review attributes. These will allow your Thymeleaf templates to display information about reviews.
Create a ReviewRepository class
This class should be annotated properly so that it can be injected into ReviewsController.
It should have a constructor that creates your Review instances and populates a Map that stores your reviews, using each review’s id as the map key.
It should have a method to find all reviews
It should have a method to find one review by id
Create a ReviewsController class.
apply proper annotation
It should inject…something appropriately
It should have a method mapped to a url that puts all of your reviews into the model, forwarding to a “reviews” template.
It should have a method mapped to a url including an id parameter that puts one of your reviews into the model, forwarding to a “review” template. This method should expect an “id” query parameter in order to select a specific review.
Place images you use into your src/main/resources/static/images folder and link to them there. Example: if your image is in src/main/resources/static/images/foo.jpg, you would reference it in your application as /images/foo.jpg.

Use your html/css-fu to style to your pages consistently and to make them appealing
