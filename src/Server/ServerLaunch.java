package Server;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.Serializable;

public class ServerLaunch extends Application {
    private Connection.NetworkConnection connection = createServer();

    private AnchorPane root1 = new AnchorPane();
    private Label username = new Label("Username :");
    private TextField userName = new TextField();
    private Label l1 = new Label("Welcome to ");
    private Label l2 = new Label("Blondie Bytes");
    private Button launch = new Button("LAUNCH");
    private Button cancel = new Button("CANCEL");
    private ImageView imageView = new ImageView("file:/C:/Users/Dell/Pictures/Saved%20Pictures/download.png");

    private Scene createContent1(){

        root1.setPrefSize(584,518);

        username.setPrefSize(128,52);
        username.setLayoutY(284);
        username.setLayoutX(231);
        username.setStyle("-fx-text-fill:#77f8c0");
        username.setFont(new Font("French Script MT",38.0));

        userName.setPrefSize(187,40);
        userName.setLayoutX(368.0);
        userName.setLayoutY(294.0);
        userName.setStyle("-fx-text-fill: deeppink");
        Paint value0 = Paint.valueOf("000000");
        userName.setStyle("-fx-control-inner-background: #"+value0.toString().substring(2));


        l1.setPrefSize(194,106);
        l1.setLayoutY(46);
        l1.setLayoutX(309);
        l1.setStyle("-fx-text-fill:#ffffff");
        l1.setFont(new Font("French Script MT",50));

        l2.setPrefSize(298,124);
        l2.setLayoutY(123);
        l2.setLayoutX(274);
        l2.setStyle("-fx-text-fill:#ffffff");
        l2.setFont(new Font("French Script MT",65));

        imageView.setFitHeight(235.0);
        imageView.setFitWidth(228.0);
        imageView.setPreserveRatio(true);
        imageView.setLayoutX(20.0);
        imageView.setLayoutY(57.0);
        imageView.setPickOnBounds(true);

        launch.setPadding(Insets.EMPTY);
        launch.setLayoutX(221.0);
        launch.setLayoutY(404.0);
        launch.setPrefSize(119,67);
        launch.setStyle("-fx-text-fill: rebeccapurple");
        launch.setStyle("-fx-text-alignment: center");
        launch.setMnemonicParsing(false);
        launch.setFont(new Font("Gill Sans MT Condensed",29));

        cancel.setPadding(Insets.EMPTY);
        cancel.setLayoutX(384.0);
        cancel.setLayoutY(404.0);
        cancel.setPrefSize(119,66);
        cancel.setStyle("-fx-text-fill: rebeccapurple");
        cancel.setStyle("-fx-text-alignment: center");
        cancel.setMnemonicParsing(false);
        cancel.setFont(new Font("Gill Sans MT Condensed",29));
        root1.getChildren().addAll(username,l1,l2,launch,cancel,imageView,userName);

        Scene scene = new Scene(root1, 584, 518);
        scene.getStylesheets().add("Server/Launch.css");
        return scene;
    }

    private TextArea messages = new TextArea();
    private TextField input = new TextField();
    private Button e1 = new Button();
    private Button e2 = new Button();
    private Button e3 = new Button();
    private Button e4 = new Button();
    private Button e5 = new Button();
    private Button e6 = new Button();
    private Button e7 = new Button();
    private Button e8 = new Button();
    private Button e9 = new Button();
    private Button e10 = new Button();
    private Button e11 = new Button();
    private Button e12 = new Button();
    private Button e13 = new Button();
    private Button e14 = new Button();
    private Button e15 = new Button();
    private Button e16 = new Button();
    private Button e17 = new Button();
    private Button e18 = new Button();
    private Button e19 = new Button();
    private Button e20 = new Button();
    private Button e21 = new Button();
    private Button e22 = new Button();
    private Button e23 = new Button();
    private Button e24 = new Button();
    private Button e25 = new Button();
    private Button e26 = new Button();
    private Button e27 = new Button();
    private Button send = new Button();
    private AnchorPane root = new AnchorPane(messages,input,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,
            e19,e20,e21,e22,e23,e24,e25,e26,e27,send);

    private Parent createContent2(){
        e1.setLayoutY(63);
        e1.setLayoutX(533);
        e1.setPrefSize(42,38);
        e1.setPadding(Insets.EMPTY);
        e1.setText("\uD83D\uDD25");
        e1.setStyle("-fx-text-fill: #ff0000;");


        e2.setLayoutY(63);
        e2.setLayoutX(483);
        e2.setPrefSize(42,38);
        e2.setPadding(Insets.EMPTY);
        e2.setText("❤");
        e2.setStyle("-fx-text-fill: #ff0000;");

        e3.setLayoutY(63);
        e3.setLayoutX(432);
        e3.setPrefSize(42,38);
        e3.setPadding(Insets.EMPTY);
        e3.setText("\uD83D\uDC44");
        e3.setStyle("-fx-text-fill: #ff0000;");

        e4.setLayoutY(111);
        e4.setLayoutX(533);
        e4.setPrefSize(42,38);
        e4.setPadding(Insets.EMPTY);
        e4.setText("\uD83E\uDDC0");
        e4.setStyle("-fx-text-fill: #ff9900;");

        e5.setLayoutY(111);
        e5.setLayoutX(432);
        e5.setPrefSize(42,38);
        e5.setPadding(Insets.EMPTY);
        e5.setText("\uD83D\uDE01");
        e5.setStyle("-fx-text-fill: #ff9900;");

        e6.setLayoutY(111);
        e6.setLayoutX(483);
        e6.setPrefSize(42,38);
        e6.setPadding(Insets.EMPTY);
        e6.setText("\uD83D\uDCA1");
        e6.setStyle("-fx-text-fill: #ff9900;");

        e7.setLayoutY(157);
        e7.setLayoutX(432);
        e7.setPrefSize(42,38);
        e7.setPadding(Insets.EMPTY);
        e7.setText("\uD83D\uDC37");
        e7.setStyle("-fx-text-fill: #ff0099;");

        e8.setLayoutY(157);
        e8.setLayoutX(483);
        e8.setPrefSize(42,38);
        e8.setPadding(Insets.EMPTY);
        e8.setText("\uD83C\uDF97");
        e8.setStyle("-fx-text-fill: #ff0099;");

        e9.setLayoutY(157);
        e9.setLayoutX(533);
        e9.setPrefSize(42,38);
        e9.setPadding(Insets.EMPTY);
        e9.setText("\uD83D\uDC69\u200D\uD83D\uDCBB");
        e9.setStyle("-fx-text-fill: #ff0099;");

        e10.setLayoutY(206);
        e10.setLayoutX(533);
        e10.setPrefSize(42,38);
        e10.setPadding(Insets.EMPTY);
        e10.setText("\uD83C\uDF7E");
        e10.setStyle("-fx-text-fill: #449c32;");

        e11.setLayoutY(206);
        e11.setLayoutX(432);
        e11.setPrefSize(42,38);
        e11.setPadding(Insets.EMPTY);
        e11.setText("\uD83C\uDF50");
        e11.setStyle("-fx-text-fill: #449c32;");

        e12.setLayoutY(206);
        e12.setLayoutX(483);
        e12.setPrefSize(42,38);
        e12.setPadding(Insets.EMPTY);
        e12.setText("\uD83C\uDF47");
        e12.setStyle("-fx-text-fill: #449c32;");

        e13.setLayoutY(250);
        e13.setLayoutX(432);
        e13.setPrefSize(42,38);
        e13.setPadding(Insets.EMPTY);
        e13.setText("\uD83C\uDF54");
        e13.setStyle("-fx-text-fill: #d65407;");

        e14.setLayoutY(250);
        e14.setLayoutX(483);
        e14.setPrefSize(42,38);
        e14.setPadding(Insets.EMPTY);
        e14.setText("\uD83C\uDF83");
        e14.setStyle("-fx-text-fill: #d65407;");

        e15.setLayoutY(250);
        e15.setLayoutX(533);
        e15.setPrefSize(42,38);
        e15.setPadding(Insets.EMPTY);
        e15.setText("\uD83C\uDFC6");
        e15.setStyle("-fx-text-fill: #d65407;");

        e16.setLayoutY(295);
        e16.setLayoutX(432);
        e16.setPrefSize(42,38);
        e16.setPadding(Insets.EMPTY);
        e16.setText("\uD83C\uDF88");
        e16.setStyle("-fx-text-fill: #699ac4;");

        e17.setLayoutY(295);
        e17.setLayoutX(533);
        e17.setPrefSize(42,38);
        e17.setPadding(Insets.EMPTY);
        e17.setText("\uD83E\uDD84");
        e17.setStyle("-fx-text-fill: #699ac4;");

        e18.setLayoutY(295);
        e18.setLayoutX(483);
        e18.setPrefSize(42,38);
        e18.setPadding(Insets.EMPTY);
        e18.setText("\uD83C\uDF0A");
        e18.setStyle("-fx-text-fill: #699ac4;");

        e21.setLayoutY(340);
        e21.setLayoutX(483);
        e21.setPrefSize(42,38);
        e21.setPadding(Insets.EMPTY);
        e21.setText("⚽");
        e21.setStyle("-fx-text-fill: #050006;");

        e19.setLayoutY(340);
        e19.setLayoutX(432);
        e19.setPrefSize(42,38);
        e19.setPadding(Insets.EMPTY);
        e19.setText("\uD83C\uDFB9");
        e19.setStyle("-fx-text-fill: #050006;");

        e20.setLayoutY(340);
        e20.setLayoutX(533);
        e20.setPrefSize(42,38);
        e20.setPadding(Insets.EMPTY);
        e20.setText("\uD83D\uDC7B");
        e20.setStyle("-fx-text-fill: #050006;");

        e22.setLayoutY(386);
        e22.setLayoutX(483);
        e22.setPrefSize(42,38);
        e22.setPadding(Insets.EMPTY);
        e22.setText("\uD83D\uDC68\u200D\uD83D\uDCBB");
        e22.setStyle("-fx-text-fill: #8b1d9b;");

        e23.setLayoutY(386);
        e23.setLayoutX(432);
        e23.setPrefSize(42,38);
        e23.setPadding(Insets.EMPTY);
        e23.setText("\uD83C\uDFBC");
        e23.setStyle("-fx-text-fill: #8b1d9b;");

        e24.setLayoutY(386);
        e24.setLayoutX(533);
        e24.setPrefSize(42,38);
        e24.setPadding(Insets.EMPTY);
        e24.setText("\uD83C\uDF46");
        e24.setStyle("-fx-text-fill: #8b1d9b;");

        e25.setLayoutY(432);
        e25.setLayoutX(483);
        e25.setPrefSize(42,38);
        e25.setPadding(Insets.EMPTY);
        e25.setText("\uD83D\uDC94");
        e25.setStyle("-fx-text-fill: #168064;");

        e26.setLayoutY(432);
        e26.setLayoutX(432);
        e26.setPrefSize(42,38);
        e26.setPadding(Insets.EMPTY);
        e26.setText("\uD83C\uDFDD");
        e26.setStyle("-fx-text-fill:#168064;");

        e27.setLayoutY(432);
        e27.setLayoutX(533);
        e27.setPrefSize(42,38);
        e27.setPadding(Insets.EMPTY);
        e27.setText("\uD83C\uDF0F");
        e27.setStyle("-fx-text-fill: #168064;");

        input.setLayoutX(20);
        input.setLayoutY(514);
        input.setPrefSize(447,52);
        messages.setLayoutX(20);
        messages.setLayoutY(36.0);
        messages.setPrefSize(384,466);
        send.setLayoutX(483);
        send.setLayoutY(518);
        send.setPrefSize(77,45);
        send.setPadding(Insets.EMPTY);
        send.setId("send");
        send.setText("SEND");
        e1.setOnAction(event -> {
            input.appendText(e1.getText());
        });
        e2.setOnAction(event -> {
            input.appendText(e2.getText());
        });
        e3.setOnAction(event -> {
            input.appendText(e3.getText());
        });
        e4.setOnAction(event -> {
            input.appendText(e4.getText());
        });
        e5.setOnAction(event -> {
            input.appendText(e5.getText());
        });
        e6.setOnAction(event -> {
            input.appendText(e6.getText());
        });
        e7.setOnAction(event -> {
            input.appendText(e7.getText());
        });
        e8.setOnAction(event -> {
            input.appendText(e8.getText());
        });
        e9.setOnAction(event -> {
            input.appendText(e9.getText());
        });
        e10.setOnAction(event -> {
            input.appendText(e10
                    .getText());
        });
        e11.setOnAction(event -> {
            input.appendText(e11.getText());
        });
        e12.setOnAction(event -> {
            input.appendText(e12.getText());
        });
        e13.setOnAction(event -> {
            input.appendText(e13.getText());
        });
        e14.setOnAction(event -> {
            input.appendText(e14.getText());
        });
        e15.setOnAction(event -> {
            input.appendText(e15.getText());
        });
        e16.setOnAction(event -> {
            input.appendText(e16.getText());
        });
        e17.setOnAction(event -> {
            input.appendText(e17.getText());
        });
        e18.setOnAction(event -> {
            input.appendText(e18.getText());
        });
        e19.setOnAction(event -> {
            input.appendText(e19.getText());
        });
        e20.setOnAction(event -> {
            input.appendText(e20.getText());
        });
        e21.setOnAction(event -> {
            input.appendText(e21.getText());
        });
        e22.setOnAction(event -> {
            input.appendText(e22.getText());
        });
        e23.setOnAction(event -> {
            input.appendText(e23.getText());
        });
        e24.setOnAction(event -> {
            input.appendText(e24.getText());
        });
        e25.setOnAction(event -> {
            input.appendText(e25.getText());
        });
        e26.setOnAction(event -> {
            input.appendText(e26.getText());
        });
        e27.setOnAction(event -> {
            input.appendText(e27.getText());
        });
        messages.setEditable(false);
        send.setOnAction((ActionEvent event) -> {
            String message = userName.getText() + " -  ";
            message+= input.getText();
            input.clear();
            messages.appendText(message+"\n");

            try{
                connection.send(message);
            }
            catch(Exception e){
                messages.appendText("Failed to send\n");
            }
        });
        input.setStyle("-fx-background-color:#f2a8ad;");
        messages.setStyle("-fx-background-color:#f2e1e1;");
        root.setStyle("-fx-background-color:#f34f7b;");
        root.getStylesheets().add("Server/Emojis.css");
        root.setPrefSize(600,590);
        return root;
    }


    public void init()throws Exception{
        connection.startConnection();
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        Platform.setImplicitExit(true);
        primaryStage.setScene(createContent1());
        primaryStage.show();
        launch.setOnAction((ActionEvent event) -> {
            primaryStage.setTitle("Welcome dear "+userName.getText());
            primaryStage.setScene(new Scene(createContent2()));
            primaryStage.show();
        });
        cancel.setOnAction((ActionEvent event) -> {
            primaryStage.close();
        });
        primaryStage.setOnCloseRequest(e -> Platform.exit());
    }

    @Override
    public void stop()throws Exception{
        try{
            connection.closeConnection();
        }catch(Exception e){
            System.out.println("Program was terminated");
        }
    }

    private Server createServer(){
        return new Server(52269, (Serializable data) ->{
            Platform.runLater(()->{
                messages.appendText(data.toString()+"\n");
            });
        });
    }

    public static void main(String args[])
    {

        launch(args);
    }
}


