# QuizApp

QuizApp is a Java-based RESTful API application for managing and playing quizzes. Built using Spring Boot and JPA, this application allows users to add, update, delete, and retrieve quiz questions by categories, send quiz responses, and calculate quiz scores—making it ideal for educational platforms or quiz apps.

## Features

- **CRUD Operations**: Create, read, update, and delete quiz questions.
- **Category Filtering**: Retrieve questions based on their category.
- **Difficulty Levels**: Each question contains a difficulty level.
- **Answer Submission & Scoring**: Send user responses and receive score based on right answers.
- **REST API**: Designed with RESTful endpoints for easy integration.

## API Endpoints

- `GET /question/allQuestions`  
  Returns all quiz questions.

- `GET /question/category/{category}`  
  Returns questions filtered by the specified category.

- `POST /question/add`  
  Adds a new question.

- `DELETE /question/delete/{id}`  
  Deletes a question by ID.

- `PUT /question/update`  
  Updates an existing question.

- `POST /quiz/submit`  
  Submits answers for a quiz and returns the score (custom implementation required; endpoint name may differ).
### Quizzes

- `GET /quiz/create?category={category}&numQ={number}&title={title}`  
  Create a new quiz with specified number of questions from the selected category.

- `GET /quiz/get/{quizId}`  
  Retrieve a quiz and its questions by quiz ID.

- `POST /quiz/submit/{quizId}`  
  Submit answers for the quiz and get the results including your score and correct answers.

## Example Question Model

```java
public class Question {
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultyLevel;
    private String category;
}
```
