package br.edu.fatecpg.gestaoAcademica.view;

import br.edu.fatecpg.gestaoAcademica.model.Aluno;
import br.edu.fatecpg.gestaoAcademica.model.Professor;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField cxProfessor;
    private JTextField cxAluno;
    private JLabel nmProfessorLabel;
    private JLabel nmAlunoLabel;
    private JLabel notasLabel;
    private Professor professor;
    private Aluno aluno;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Main() {
        professor = new Professor();
        aluno = new Aluno();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        nmProfessorLabel = new JLabel("Nome do Professor:");
        nmProfessorLabel.setBounds(10, 10, 400, 20);
        contentPane.add(nmProfessorLabel);


        cxProfessor = new JTextField();
        cxProfessor.setBounds(10, 40, 200, 20);
        contentPane.add(cxProfessor);
        cxProfessor.setColumns(10);


        JButton confirmProfessor = new JButton("Confirmar");
        confirmProfessor.setBounds(220, 40, 100, 20);
        contentPane.add(confirmProfessor);

        confirmProfessor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeProfessor = cxProfessor.getText();
                professor.setNmProfessor(nomeProfessor);
                nmProfessorLabel.setText("Nome do Professor: " + nomeProfessor);
            }
        });


        nmAlunoLabel = new JLabel("Nome do Aluno:");
        nmAlunoLabel.setBounds(10, 80, 400, 20);
        contentPane.add(nmAlunoLabel);


        cxAluno = new JTextField();
        cxAluno.setBounds(10, 110, 200, 20);
        contentPane.add(cxAluno);
        cxAluno.setColumns(10);


        JButton confirmAluno = new JButton("Confirmar");
        confirmAluno.setBounds(220, 110, 100, 20);
        contentPane.add(confirmAluno);

        notasLabel = new JLabel("Notas: ");
        notasLabel.setBounds(10, 150, 400, 100);
        contentPane.add(notasLabel);

        confirmAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeAluno = cxAluno.getText();
                aluno.setnomeAluno(aluno);
                aluno.setNotaMatematica(8.8);
                aluno.setNotaPortugues(7.9);
                aluno.setNotaHistória(6.7);
                aluno.setNotaGeografia(7.5);

                nmAlunoLabel.setText("Nome do Aluno: " + nomeAluno);
                notasLabel.setText("<html>Notas:<br>Matemática: " + aluno.getNotaMatematica() +
                                   "<br>Português: " + aluno.getNotaPortugues() +
                                   "<br>História: " + aluno.getNotaHistória() +
                                   "<br>Geografia: " + aluno.getNotaGeografia() + "</html>");
            }
        });
    }
}
