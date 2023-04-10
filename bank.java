import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.event.*;

@SuppressWarnings("serial")
class UserManual extends JFrame implements ActionListener {
    // public static final long serialVersionUID=1L;
    JLabel l1, l2;
    JButton b1, b2;
    JFrame jf0, jf1, jf2, scheme0;

    UserManual() {
        jf0 = new JFrame();
        setTitle("Zero Bank");
        setSize(600, 600);
        setVisible(true);
        setLayout(null);

        l1 = new JLabel("Welcome to ZERO BANK");
        l1.setFont(new Font("SansSerif", Font.BOLD, 30));
        l2 = new JLabel("Choose who are you from Below");
        b1 = new JButton("Old User");
        b2 = new JButton("New User");

        b1.addActionListener(this);
        b2.addActionListener(this);

        l1.setBounds(100, 150, 400, 30);
        l2.setBounds(300, 180, 400, 30);
        b1.setBounds(200, 250, 200, 40);
        b2.setBounds(200, 310, 200, 40);

        add(l1);
        add(l2);
        add(b1);
        add(b2);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            oldUser();
        } else if (ae.getSource() == b2) {
            newUser();
        }
    }

    public void oldUser() {
        jf1 = new JFrame();
        jf1.setTitle("Zero Bank Old User");
        jf1.setSize(600, 600);
        jf1.setVisible(true);
        jf1.setLayout(null);
        setVisible(false);

        JLabel ol0, ol1, ol2, ol3, ol4;
        JTextField name;
        JPasswordField pass;
        JButton login, clearall;
        JToggleButton showhide;

        ol0 = new JLabel("Welcome back user nice to see you");
        ol0.setFont(new Font("Algerian", Font.PLAIN, 30));

        ol1 = new JLabel("Enter Your name and password to login");
        ol1.setFont(new Font("mono", Font.PLAIN, 20));
        ol1.setForeground(Color.red);

        ol2 = new JLabel("Name");
        ol2.setFont(new Font("mono", Font.BOLD, 15));

        ol3 = new JLabel("Password");
        ol3.setFont(new Font("mono", Font.BOLD, 15));
        ImageIcon i = new ImageIcon("bank.jpg");
        ol4 = new JLabel(i);

        name = new JTextField(15);
        pass = new JPasswordField(15);
        pass.setEchoChar('*');
        pass.setToolTipText("Default password is your name appended to 123");

        login = new JButton("Login");
        clearall = new JButton("Clear");
        clearall.setToolTipText("Clear name and password");

        showhide = new JToggleButton("Show");
        showhide.setToolTipText("Show the Password");

        ol0.setBounds(15, 15, 550, 40);
        ol1.setBounds(100, 75, 550, 40);
        ol2.setBounds(100, 150, 100, 25);
        ol3.setBounds(100, 225, 100, 25);
        ol4.setBounds(200, 325, 200, 200);

        name.setBounds(225, 150, 150, 25);
        pass.setBounds(225, 225, 150, 25);
        login.setBounds(250, 275, 100, 25);

        clearall.setBounds(400, 150, 100, 25);
        showhide.setBounds(400, 225, 100, 25);

        jf1.add(ol0);
        jf1.add(ol1);
        jf1.add(ol2);
        jf1.add(ol3);
        jf1.add(name);
        jf1.add(pass);
        jf1.add(login);
        jf1.add(ol4);
        jf1.add(clearall);
        jf1.add(showhide);

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String str0 = String.valueOf(pass.getPassword());
                if (!name.getText().equals("")) {
                    if (!str0.equals("")) {
                        String s1 = name.getText().toString();
                        String s2 = String.valueOf(pass.getPassword());
                        final String s3[] = { s1.concat("123") };

                        if (s2.toString().equals(s3[0].toString())) {

                            JFrame oldUserLogin = new JFrame();
                            jf1.setVisible(false);

                            oldUserLogin.setTitle("Zero Bank");
                            oldUserLogin.setSize(600, 600);
                            oldUserLogin.setVisible(true);
                            oldUserLogin.setLayout(null);
                            setVisible(false);

                            JButton showbal, hidebal, addamount, withdrawamount, changepass, schemes, logout;
                            JLabel old1, show0;
                            JTextField balance;

                            final int bal[] = { 10000 };
                            // String s1;

                            old1 = new JLabel("Welcome back " + s1);
                            old1.setFont(new Font("mono", Font.BOLD, 40));
                            showbal = new JButton("Get Balance");
                            show0 = new JLabel("Your balance");
                            balance = new JTextField("INR " + bal[0]);
                            hidebal = new JButton("Hide Balance");
                            addamount = new JButton("Add amount");
                            withdrawamount = new JButton("Withdraw amount");
                            changepass = new JButton("Change password");
                            schemes = new JButton("Our schemes");
                            logout = new JButton("Log Out");

                            showbal.setBounds(400, 400, 150, 150);
                            old1.setBounds(10, 10, 600, 50);
                            show0.setBounds(400, 400, 150, 50);
                            balance.setBounds(400, 450, 150, 25);
                            balance.setEditable(false);
                            hidebal.setBounds(400, 500, 150, 50);
                            addamount.setBounds(100, 100, 150, 50);
                            withdrawamount.setBounds(150, 200, 150, 50);
                            changepass.setBounds(100, 300, 150, 50);
                            schemes.setBounds(150, 400, 150, 50);
                            logout.setBounds(100, 500, 150, 50);

                            show0.setVisible(false);
                            balance.setVisible(false);
                            hidebal.setVisible(false);

                            addamount.setBackground(Color.GREEN);
                            withdrawamount.setBackground(Color.RED);
                            changepass.setBackground(Color.MAGENTA);
                            schemes.setBackground(Color.PINK);
                            logout.setBackground(Color.YELLOW);

                            oldUserLogin.add(showbal);
                            oldUserLogin.add(old1);
                            oldUserLogin.add(balance);
                            oldUserLogin.add(show0);
                            oldUserLogin.add(hidebal);
                            oldUserLogin.add(addamount);
                            oldUserLogin.add(changepass);
                            oldUserLogin.add(withdrawamount);
                            oldUserLogin.add(schemes);
                            oldUserLogin.add(logout);

                            oldUserLogin.addWindowListener(new WindowAdapter() {
                                public void windowClosing(WindowEvent we) {
                                    System.exit(0);
                                }
                            });

                            showbal.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent ae) {
                                    try {
                                        String passw = JOptionPane.showInputDialog("Enter your Password");

                                        if (passw.equals(s3[0])) {
                                            show0.setVisible(true);
                                            balance.setVisible(true);
                                            hidebal.setVisible(true);
                                            showbal.setVisible(false);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Password entered is incorrect",
                                                    "Incorrect Password", JOptionPane.ERROR_MESSAGE);
                                        }
                                    } catch (NullPointerException e) {
                                        JOptionPane.showMessageDialog(null, "Transition cancelled by user", "Failed",
                                                JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            });

                            hidebal.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent ae) {
                                    balance.setVisible(false);
                                    show0.setVisible(false);
                                    hidebal.setVisible(false);
                                    showbal.setVisible(true);
                                }
                            });

                            addamount.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent ae) {
                                    try {
                                        int addamt = Integer.parseInt(
                                                JOptionPane.showInputDialog("Enter amount to add in the bank"));

                                        bal[0] += addamt;
                                        balance.setText("INR " + bal[0]);
                                    } catch (Exception e) {
                                        JOptionPane.showMessageDialog(null,
                                                "Transition cancelled by user \n Or value entered is invalid");
                                    }
                                }
                            });

                            withdrawamount.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent ae) {
                                    try {
                                        int withdrawamt = Integer.parseInt(
                                                JOptionPane.showInputDialog("Enter amount to withdraw from the bank"));
                                        if (withdrawamt <= bal[0]) {
                                            bal[0] -= withdrawamt;
                                            balance.setText("INR " + bal[0]);
                                        } else {
                                            JOptionPane.showMessageDialog(null,
                                                    "An error occured \n Withdrawal amount cannot be greater than bank balance \n are you thinking make bank bankrupt O_O",
                                                    "Error", JOptionPane.ERROR_MESSAGE);

                                        }
                                    } catch (Exception e) {
                                        JOptionPane.showMessageDialog(null,
                                                "Transition cancelled by user \n Or value entered is invalid", "Failed",
                                                JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            });

                            changepass.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent ae) {
                                    try {
                                        String confirmpass = JOptionPane.showInputDialog("please enter your password");

                                        if (confirmpass.equals(s3[0])) {
                                            String newpass = JOptionPane.showInputDialog("please enter new password");

                                            if (!newpass.equals("")) {
                                                s3[0] = ("").concat(newpass);
                                                JOptionPane.showMessageDialog(null,
                                                        "password changed successfully \n Don't forgot it");
                                                // System.out.println(newpass);
                                            } else {
                                                JOptionPane.showMessageDialog(null,
                                                        "an error occured \n unable to change password", "Error",
                                                        JOptionPane.ERROR_MESSAGE);
                                                JOptionPane.showMessageDialog(null, "because null cannot be password",
                                                        "Hint", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "password entered is invalid", "Error",
                                                    JOptionPane.ERROR_MESSAGE);
                                        }

                                    } catch (Exception e) {
                                        JOptionPane.showMessageDialog(null,
                                                "Transition cancelled by user \n Or value entered is invalid", "Failed",

                                                JOptionPane.WARNING_MESSAGE);
                                    }
                                }
                            });

                            logout.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent ae) {
                                    setVisible(true);
                                    oldUserLogin.setVisible(false);
                                }
                            });

                            schemes.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent ae) {
                                    scheme();
                                }
                            });
                        } else {
                            JOptionPane.showMessageDialog(null, "Password entered is incorrect", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please first Enter Your Password", "Error",
                                JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please first Enter Your name", "Error",
                            JOptionPane.WARNING_MESSAGE);
                }

            }

        });

        clearall.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                name.setText("");

                pass.setText("");
            }
        });

        showhide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (showhide.isSelected()) {
                    pass.setEchoChar((char) 0);
                    showhide.setText("Hide");
                    showhide.setToolTipText("Hide the Password");
                } else {
                    pass.setEchoChar('*');
                    showhide.setText("Show");
                    showhide.setToolTipText("Show the Password");
                }
            }
        });

        jf1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                // if(JOptionPane.showConfirmDialog(jf1,"Are You sure You want to Exit?","Close
                // window?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                System.exit(0);

            }

        });
    }

    public void scheme() {
        JOptionPane.showMessageDialog(null,
                "Here are only details of our popular schemes: \n\n Scheme name Amount to invest Period Outcome \n\n Dhanshree 15000 18 Y 1 Lakh \n Daughter Marriage 20000 15 Y 1 Lakh \n Be Millionaire 30000 12 Y 1 Lakh \n Money *2 Above 5000 80 M Amount*2 \n Money *1.5 Above 5000 50 M Amount*1.5 \n Million Dream 1000 Monthly 70 M 1 Lakh \n OP Money 2000 Monthly 40 M 1 Lakh \n Life Helper 1000 Monthly 10 Y 2.05 Lakh or 1500 monthly(LifeTime)",
                "Our Schemes", JOptionPane.PLAIN_MESSAGE);

    }

    public void newUser() {
        jf2 = new JFrame();
        jf2.setTitle("Zero Bank New User");
        jf2.setSize(600, 600);
        jf2.setVisible(true);
        jf2.setLayout(null);
        setVisible(false);

        JLabel welcomenew, image;
        JButton create, schemes, oldusr;

        welcomenew = new JLabel("Welcome to Bank user, nice to see you");
        welcomenew.setFont(new Font("Algerian", Font.PLAIN, 25));

        create = new JButton("Create Account");
        schemes = new JButton("Schemes");
        oldusr = new JButton("Old User?");

        ImageIcon j = new ImageIcon("bank.jpg");
        image = new JLabel(j);

        welcomenew.setBounds(35, 15, 550, 40);
        create.setBounds(225, 100, 150, 50);
        schemes.setBounds(225, 175, 150, 50);
        oldusr.setBounds(225, 250, 150, 50);
        image.setBounds(200, 400, 200, 200);

        create.setBackground(Color.ORANGE);
        schemes.setBackground(Color.WHITE);
        schemes.setForeground(Color.BLUE);
        oldusr.setBackground(Color.GREEN);

        jf2.add(welcomenew);
        jf2.add(create);

        jf2.add(schemes);
        jf2.add(oldusr);
        jf2.add(image);

        create.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                create.setVisible(false);
                schemes.setVisible(false);
                oldusr.setVisible(false);

                JLabel fname, mname, lname, email, mobile, city, pin, image;
                JTextField fname0, mname0, lname0, email0, mobile0, city0, pin0;
                JButton proceed, edit, next;

                fname = new JLabel("First Name");
                mname = new JLabel("Middle Name");
                lname = new JLabel("Last Name");
                email = new JLabel("E-Mail");
                mobile = new JLabel("Mobile no");
                city = new JLabel("City");
                pin = new JLabel("Pin Code");

                fname0 = new JTextField();
                mname0 = new JTextField();
                lname0 = new JTextField();
                email0 = new JTextField();
                mobile0 = new JTextField();
                city0 = new JTextField();
                pin0 = new JTextField();

                proceed = new JButton("Proceed");
                edit = new JButton("Edit");
                next = new JButton("Next");

                Font f = new Font("SansSerif", Font.BOLD, 20);

                fname.setFont(f);

                mname.setFont(f);
                lname.setFont(f);
                email.setFont(f);
                mobile.setFont(f);
                city.setFont(f);
                pin.setFont(f);

                fname.setBounds(50, 100, 150, 25);
                mname.setBounds(50, 140, 150, 25);
                lname.setBounds(50, 180, 150, 25);
                email.setBounds(50, 220, 150, 25);
                mobile.setBounds(50, 260, 150, 25);
                city.setBounds(50, 300, 150, 25);
                pin.setBounds(50, 340, 150, 25);

                fname.setOpaque(true);
                mname.setOpaque(true);
                lname.setOpaque(true);
                email.setOpaque(true);
                mobile.setOpaque(true);
                city.setOpaque(true);
                pin.setOpaque(true);

                fname.setBackground(Color.lightGray);
                mname.setBackground(Color.lightGray);
                lname.setBackground(Color.lightGray);
                email.setBackground(Color.lightGray);
                mobile.setBackground(Color.lightGray);
                city.setBackground(Color.lightGray);
                pin.setBackground(Color.lightGray);

                fname0.setBounds(250, 100, 150, 25);
                mname0.setBounds(250, 140, 150, 25);
                lname0.setBounds(250, 180, 150, 25);
                email0.setBounds(250, 220, 150, 25);
                mobile0.setBounds(250, 260, 150, 25);
                city0.setBounds(250, 300, 150, 25);

                pin0.setBounds(250, 340, 150, 25);

                proceed.setBounds(210, 375, 185, 40);
                edit.setBounds(30, 375, 165, 40);
                next.setBounds(410, 375, 165, 40);

                edit.setVisible(false);
                next.setVisible(false);

                jf2.add(fname);
                jf2.add(mname);
                jf2.add(lname);
                jf2.add(email);
                jf2.add(mobile);
                jf2.add(city);
                jf2.add(pin);

                jf2.add(fname0);
                jf2.add(mname0);
                jf2.add(lname0);
                jf2.add(email0);
                jf2.add(mobile0);
                jf2.add(city0);
                jf2.add(pin0);

                jf2.add(proceed);
                jf2.add(edit);
                jf2.add(next);

                jf2.setVisible(false);
                jf2.setVisible(true);

                proceed.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {

                        if (!fname0.getText().equals("")) {
                            if (!mname0.getText().equals("")) {

                                if (!lname0.getText().equals("")) {
                                    if (!email0.getText().equals("")) {
                                        if (email0.getText().contains("@")) {
                                            if (email0.getText().contains(".com")) {
                                                if (!mobile0.getText().equals("")) {
                                                    if (mobile0.getText().length() == 10) {
                                                        if (mobile0.getText().matches("[0-9]+")) {
                                                            if (!city0.getText().equals("")) {
                                                                if (!pin0.getText().equals("")) {
                                                                    proceed.setVisible(false);
                                                                    edit.setVisible(true);
                                                                    next.setVisible(true);

                                                                    fname0.setEditable(false);
                                                                    mname0.setEditable(false);
                                                                    lname0.setEditable(false);
                                                                    email0.setEditable(false);
                                                                    mobile0.setEditable(false);
                                                                    city0.setEditable(false);
                                                                    pin0.setEditable(false);
                                                                } else {
                                                                    JOptionPane.showMessageDialog(null,
                                                                            "Please enter your pin", "Error",
                                                                            JOptionPane.WARNING_MESSAGE);
                                                                }
                                                            } else {
                                                                JOptionPane.showMessageDialog(null,
                                                                        "Please enter your city", "Error",
                                                                        JOptionPane.WARNING_MESSAGE);
                                                            }
                                                        } else {
                                                            JOptionPane.showMessageDialog(null,
                                                                    "phone number contains invalid characters", "Error",
                                                                    JOptionPane.WARNING_MESSAGE);
                                                        }
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,

                                                                "phone number must be 10 digit", "Error",
                                                                JOptionPane.WARNING_MESSAGE);
                                                    }
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Please enter Your mobile",
                                                            "Error", JOptionPane.WARNING_MESSAGE);
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Email missing Top level Domain",
                                                        "Error", JOptionPane.WARNING_MESSAGE);
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Email missing @", "Error",
                                                    JOptionPane.WARNING_MESSAGE);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Please Enter Your Email", "Error",
                                                JOptionPane.WARNING_MESSAGE);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please Enter Your Last Name", "Error",
                                            JOptionPane.WARNING_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Please Enter Your Middle Name", "Error",
                                        JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Please first Enter Your First Name", "Error",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    }
                });

                edit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        proceed.setVisible(true);

                        edit.setVisible(false);
                        next.setVisible(false);

                        fname0.setEditable(true);
                        mname0.setEditable(true);
                        lname0.setEditable(true);
                        email0.setEditable(true);
                        mobile0.setEditable(true);
                        city0.setEditable(true);
                        pin0.setEditable(true);
                    }
                });

                next.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        JOptionPane.showMessageDialog(null,
                                "Account created\n now you can log in\n your password is ${name}123", "Account Created",
                                JOptionPane.PLAIN_MESSAGE);

                        jf2.setVisible(false);
                        oldUser();
                    }
                });
            }
        });

        schemes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                scheme();
            }
        });

        oldusr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                oldUser();
                jf2.setVisible(false);
            }

        });

        jf2.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

public class bank {
    public static void main(String[] args) {
        UserManual um = new UserManual();
        um.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}