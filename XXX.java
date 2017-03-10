package Proba;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class XXX extends Application {
    String s;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane panel = new Pane();

        TextField t1 = new TextField();
        t1.setLayoutX(29);
        t1.setLayoutY(10);
        t1.setMaxWidth(60);
        Label l1 = new Label("a:");
        l1.setLayoutX(10);
        l1.setLayoutY(10);
        l1.setFont(new Font("Cambria", 18));

        TextField t2 = new TextField();
        t2.setLayoutX(121);
        t2.setLayoutY(10);
        t2.setMaxWidth(60);
        Label l2 = new Label("b:");
        l2.setLayoutX(103);
        l2.setLayoutY(10);
        l2.setFont(new Font("Cambria", 18));


        TextField t3 = new TextField();
        t3.setLayoutX(209);
        t3.setLayoutY(10);
        t3.setMaxWidth(60);
        Label l3 = new Label("c:");
        l3.setLayoutX(190);
        l3.setLayoutY(10);
        l3.setFont(new Font("Cambria", 18));


        Button find = new Button("Результат:");
        find.setLayoutX(10);
        find.setLayoutY(50);

        Label label=new Label();
        label.setLayoutX(90);
        label.setLayoutY(50);



        panel.getChildren().addAll(t1, l1, t2, l2, t3, l3, find,label);

        find.setOnAction(event ->
                label.setText(go(t1.getText(), t2.getText(),t3.getText())));

        Scene scene = new Scene(panel, 400, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Квадратне рівняння");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);}

   public String go(String a1, String b1, String c1) {
        double a= parseDouble(a1);
        double b= parseDouble(b1);
        double c= parseDouble(c1);
        String aa1 = null;

        double d = (b * b) - (4.0 * a * c);
        //все нули
        if (a == 0 && b == 0 && c == 0) {

            System.out.println("x1=");
            System.out.println("x2=");
            aa1 = "X1 = " + "\nX2 = ";
         
        }
        //a i b =0
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("x1=");
            System.out.println("x2=");
            aa1 = "X1 = " + "\nX2 = ";
         
        }
        //a i c=0
        if (a == 0 && b != 0 && c == 0) {
            System.out.println("x1=0.0");
            System.out.println("x2=0.0");
            aa1 = "X1 = " + "\nX2 = ";
           
        }
        //b i c =0
        if (a != 0 && b == 0 && c == 0) {
            System.out.println("x1=0.0");
            System.out.println("x2=0.0");
            aa1 = "X1 = " + "\nX2 = ";
           
        }
        //a=0
        if (a == 0 && b != 0 && c != 0) {
            double temp_a = -c / b;
            System.out.println("x1=" + temp_a);
            System.out.println("x2=" + temp_a);
            aa1 = "X1 = " + temp_a + "\nX2 = " +temp_a;
          
        }
        //b=0
        if (a != 0 && b == 0 && c != 0) {
            double temp = Math.sqrt(-c / a);
            if (temp > 0) {
                System.out.println("x1=" + temp);
                System.out.println("x2=" + -temp);
                aa1 = "X1 = " + temp + "\nX2 = " +-temp;
            } else {
                System.out.println("x1=");
                System.out.println("x2=");
                aa1 = "X1 = " + "\nX2 = ";
            }

           
        }
        //c=0
        if (a != 0 && b != 0 && c == 0) {
            double temp1= -b / a;
            aa1 = "X1 =0.0 " + "\nX2 = "+temp1 ;
           
        }

        if (a != 0 && b != 0 && c != 0) {
            if (d < 0.0) {
                System.out.println("x1=");
                System.out.println("x2=");
                aa1 = "X1 = " + "\nX2 = ";
                
            }

            if (d == 0.0) {
                double x3 = -b / (2.0 * a);
                System.out.println("x1=" + x3);
                System.out.println("x2=" + x3);
                aa1 = "X1 = " + x3 + "\nX2 = " + x3;
               

            }
            if (d > 0.0) {
                double x1 = (-b + Math.sqrt(d)) / (2.0 * a);
                double x2 = (-b - Math.sqrt(d)) / (2.0 * a);
                aa1 = "X1 = " + x1 + "\nX2 = " + x2;
             

            }
        }
       return aa1;
   }
}

