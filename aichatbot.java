import java.util.Scanner;

public class aichatbot {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Hello! I am your AI chatbot. How can I assist you today?");
        System.out.println("   CODEALPHA AI CHATBOT");
        System.out.println("Type 'bye' to exit the chat.");
        System.out.println("---------------------------------");

        while(true){

            System.out.println("\nYou: ");
            String input = sc.nextLine().toLowerCase().trim();

            if(input.contains("hello") || input.contains("hi")){
                System.out.println("Bot: Hello! How can I help you ?");
            }

            else if(input.contains("how are you")){
                System.out.println("Bot: I am fine. Thank you for asking!");
            }

            else if(input.contains("your name")){
                System.out.println("Bot: I am CodeAlpha AI Chatbot.");
            }

             else if(input.contains("who are you")){
                System.out.println("Bot: I am a Java-based AI chatbot developed for CodeAlpha.");
            }

             else if(input.contains("java")){
                System.out.println("Bot: Java is a popular object-oriented programming language.");

            }
             else if(input.contains("oop")){
                System.out.println("Bot: OOP stands for Object-Oriented Programming language.");
            }
             else if(input.contains("inheritance")){
                System.out.println("Bot: Inheritance allows one class to aquire properties from parent class.");
            }
             else if(input.contains("polymorphism")){
                System.out.println("Bot: Polymorphism in Java means the ability of a single action, method, or object to take on many forms.");
            }
             else if(input.contains("encapsulation")){
                System.out.println("Bot: Encapsulation in Java is the process of bundling data (variables) and methods into a single unit (a class) while restricting direct external access to the internal state using private modifiers and public getter and setter methods.");
            }
             else if(input.contains("abstraction")){
                System.out.println("Bot: Abstraction in Java is the process of hiding complex internal implementation details while exposing only the essential features of an object.");
            }
             else if(input.contains("ai")){
                System.out.println("Bot: AI stands for Artificial Intelligence.");
            }
            else if(input.contains("machine learning")){
                System.out.println("Bot: Machine learning in Java is the development and deployment of predictive models using Java-based frameworks and libraries");
            }
            else if(input.contains("nlp")){
                System.out.println("Bot: NLP stands for Natural Language Processing.");
            }
            else if(input.contains("who created java")){
                System.out.println("Bot: Java was created by James Gosling.");
            }
            else if(input.contains("thank you")){
                System.out.println("Bot: You're Welcome.");
            }
             else if(input.contains("bye")){
                System.out.println("Bot: Goodbye! Have a nice day.");
            }
             else {
                System.out.println("Bot: Sorry, I don't understand that question.");
            }
        }



    }
    
}
