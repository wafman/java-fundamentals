# Inheritance

## Lab 6: Inheritance

### Challenges
- getting the classes to relate without using inheritance
- create restaurant class
- create review class
- create ```addReview(Review)``` to restaurant class

### Approach
- using a form of composition, by creating an instance of the review class in the restaurant class.
- test constructors for both restaurant and review classes
- test ```toString()``` for both restaurant and review classes
- test to make sure ```addReview(Review)``` is actually adding a review to the restaurant and affecting the restaurants star rating.


## Lab 7: Inheritance Continued

### Challenges
- creating shop class
- creating theater class
- ```addReview(Review)``` to both shop and theater classes
- ```addMovie(String movieName)``` for theater class
- ```removeMovie(String movieName)``` for theater class
- make movie name optional for theater reviews

### Approach
- continued using composition, refactoring from yesteray to ensure both review and class being reviewed are aware of each other (instances)
- testing constructors for shop and theater classes
- test ```addMovie(String movieName)``` from theater class
- test ```removeMovie(String movieName)``` from theater class
- ensure exceptions are thrown if movie is not contained in remove function
- ensure exceptions are thrown if there are no movies when you try to remove a movie.