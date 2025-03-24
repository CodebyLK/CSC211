import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class EmployeeInfo extends Frame implements ActionListener {

    Label nameLabel, idLabel, deptLabel;
    TextField text1, text2, text3;
    TextArea infoArea;
    Button submitButton;

    public EmployeeInfo() {
        super("Employee Information");
        setSize(425, 375);
        setLayout(null);

        nameLabel = new Label("Name");
        nameLabel.setBounds(90, 50, 80, 30);
        add(nameLabel);

        idLabel = new Label("Employee ID");
        idLabel.setBounds(90, 100, 80, 30);
        add(idLabel);

        deptLabel = new Label("Department");
        deptLabel.setBounds(90, 150, 80, 30);
        add(deptLabel);

        infoArea = new TextArea();
        infoArea.setBounds(65, 250, 300, 100);
        infoArea.setEditable(false);
        add(infoArea);

        text1 = new TextField();
        text1.setBounds(180, 50, 150, 25);
        add(text1);

        text2 = new TextField();
        text2.setBounds(180, 100, 150, 25);
        add(text2);

        text3 = new TextField();
        text3.setBounds(180, 150, 150, 25);
        add(text3);

        submitButton = new Button("Submit");
        submitButton.setBounds(175, 190, 85, 40);
        add(submitButton);

        submitButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nameInput = text1.getText();
        String idInput = text2.getText();
        String deptInput = text3.getText();
        infoArea.setText("                        Employee Information\n\nName: " + nameInput + "\nID: " + idInput + "\nDepartment: " + deptInput);

    }

    public static void main(String[] args) {
        new EmployeeInfo();
    }
}
