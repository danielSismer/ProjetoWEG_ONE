package net.weg.apresentation;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;


public class OpcoesDoMenu {


    private JFrame TelaMenu;


    public void ClickCadastrar() {


        JFrame TelaCadastrar = new JFrame("Sistema com Menu Lateral");
        TelaCadastrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TelaCadastrar.setSize(900, 600);
        TelaCadastrar.setExtendedState(JFrame.MAXIMIZED_BOTH);
        TelaCadastrar.setLayout(null);
        TelaCadastrar.setVisible(true);

        JPanel painelFundo2 = new JPanel();
        painelFundo2.setLayout(null);
        painelFundo2.setBackground(Color.WHITE);
        painelFundo2.setBounds(0, 0, 1920, 1080);
        TelaCadastrar.add(painelFundo2);

        JPanel painelCadastrarOrientacao = new JPanel();
        painelCadastrarOrientacao.setLayout(null);
        painelCadastrarOrientacao.setBackground(new Color(0, 87, 156));
        painelCadastrarOrientacao.setBounds(235, 200, 1450, 700);
        painelFundo2.add(painelCadastrarOrientacao);

        JLabel labelTitulo = new JLabel("Criar Orientação:");
        labelTitulo.setForeground(Color.WHITE);
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        labelTitulo.setBounds(30, 30, 200, 30);
        painelFundo2.add(labelTitulo);
        labelTitulo.setVisible(false);



        JLabel msgmCadastrar = new JLabel("Titulo da Orientação:");
        msgmCadastrar.setForeground(Color.WHITE);
        msgmCadastrar.setFont(new Font("Arial", Font.BOLD, 25));
        msgmCadastrar.setBounds(103, 80, 400, 30);
        painelCadastrarOrientacao.add(msgmCadastrar);

        JTextField campoCadastrar = new JTextField();
        campoCadastrar.setBounds(100, 120, 1249, 50);
        campoCadastrar.setFont(new Font("Arial", Font.BOLD, 25));
        painelCadastrarOrientacao.add(campoCadastrar);


        JLabel labelDescricao = new JLabel("Descrição:");
        labelDescricao.setForeground(Color.WHITE);
        labelDescricao.setFont(new Font("Arial", Font.BOLD, 25));
        labelDescricao.setBounds(103, 220, 400, 30);
        painelCadastrarOrientacao.add(labelDescricao);

        JTextArea campoCadastrarDescricao = new JTextArea();
        campoCadastrarDescricao.setBounds(100, 260, 640, 220);
        campoCadastrarDescricao.setFont(new Font("Arial", Font.BOLD, 17));
        campoCadastrarDescricao.setLineWrap(true);
        campoCadastrarDescricao.setWrapStyleWord(true);
        campoCadastrarDescricao.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        painelCadastrarOrientacao.add(campoCadastrarDescricao);

        JButton botaoCadastrarOrientacao = new JButton("Cadastrar Orientação");
        botaoCadastrarOrientacao.setFont(new Font("Arial", Font.BOLD, 20));
        botaoCadastrarOrientacao.setBounds(258, 550, 340, 65);
        painelCadastrarOrientacao.add(botaoCadastrarOrientacao);


        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));
        headerPanel.setBackground(new Color(0, 87, 156));
        headerPanel.setBounds(0, 0, 1920, 80);
        painelFundo2.add(headerPanel);

        JButton botaoIdioma = new JButton("\uD83C\uDF10");
        botaoIdioma.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoIdioma.setFocusPainted(false);
        botaoIdioma.setBackground(new Color(0, 87, 156));
        botaoIdioma.setForeground(Color.WHITE);

        JButton botaoVoltar = new JButton("◀️");
        botaoVoltar.setFont(new Font("SansSerif", Font.PLAIN, 25));
        botaoVoltar.setBackground(new Color(0, 87, 156));
        botaoVoltar.setForeground(Color.WHITE);


        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                TelaCadastrar.setVisible(false);


            }
        });


        headerPanel.add(botaoVoltar);
        headerPanel.add(Box.createHorizontalGlue());
        headerPanel.add(botaoIdioma);



    }


    public void ClickPesquisar() {


        JFrame TelaPesquisar = new JFrame("Sistema com Menu Lateral");
        TelaPesquisar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TelaPesquisar.setSize(900, 600);
        TelaPesquisar.setExtendedState(JFrame.MAXIMIZED_BOTH);
        TelaPesquisar.setLayout(new BorderLayout());


        JPanel menuLateral = new JPanel();
        menuLateral.setBackground(new Color(0, 87, 156));
        menuLateral.setLayout(null);
        menuLateral.setPreferredSize(new Dimension(270, TelaPesquisar.getHeight()));


        JButton fecharMenu = new JButton("☰");
        fecharMenu.setFont(new Font("SansSerif", Font.BOLD, 30));
        fecharMenu.setFocusPainted(false);
        fecharMenu.setBackground(new Color(0, 87, 156));
        fecharMenu.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        fecharMenu.setForeground(Color.WHITE);
        fecharMenu.setBounds(9, 19, 50, 30);
        fecharMenu.setVisible(true);
        menuLateral.add(fecharMenu);


        JPanel painelCentral = new JPanel();
        painelCentral.setBackground(new Color(255, 255, 255));
        painelCentral.setLayout(new BorderLayout());
        painelCentral.setAlignmentX(Component.CENTER_ALIGNMENT);
        painelCentral.setVisible(true);

        painelCentral.add(Box.createVerticalGlue());

        JButton pasta1 = new JButton("Manual de Operação");
        pasta1.setAlignmentX(Component.CENTER_ALIGNMENT);
        pasta1.setMaximumSize(new Dimension(180, 50));
        pasta1.setFont(new Font("Arial", Font.BOLD, 14));
        pasta1.setFocusPainted(false);
        pasta1.setBackground(new Color(52, 152, 219));
        pasta1.setForeground(Color.WHITE);
        pasta1.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        pasta1.setBounds(14, 69, 240, 50);
        menuLateral.add(pasta1);


        pasta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JPanel menuLateral1 = new JPanel();
                menuLateral1.setBackground(new Color(0, 87, 156));
                menuLateral1.setLayout(new BoxLayout(menuLateral1, BoxLayout.Y_AXIS));
                menuLateral1.setPreferredSize(new Dimension(270, TelaPesquisar.getHeight()));


                TelaPesquisar.add(menuLateral1, BorderLayout.WEST);
                menuLateral.setVisible(false);


                menuLateral1.add(Box.createVerticalStrut(69));


                ArrayList<Orientacao> orientacoes1 = new ArrayList<>();


                try (Connection conexao = DriverManager.getConnection("jdbc:mysql://yamanote.proxy.rlwy.net:40662/railway", "root", "kGYqssqFVqrEqdAnaWfGAUrQifPUxhxb")) {
                    String sql = "SELECT titulo, descricao FROM orientacoes WHERE tipo_id = 1";
                    PreparedStatement stmt = conexao.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();


                    while (rs.next()) {
                        String titulo1 = rs.getString("titulo");
                        String descricao1 = rs.getString("descricao");
                        orientacoes1.add(new Orientacao(titulo1, descricao1));
                    }


                    rs.close();
                    stmt.close();
                } catch (SQLException f) {
                    f.printStackTrace();
                }


                JLabel mensagem1 = new JLabel("");
                painelCentral.add(Box.createVerticalStrut(20));
                mensagem1.setHorizontalAlignment(SwingConstants.CENTER);
                mensagem1.setVerticalAlignment(SwingConstants.TOP);
                painelCentral.add(mensagem1, BorderLayout.NORTH);
                painelCentral.revalidate();
                painelCentral.repaint();

                for (Orientacao orientacao : orientacoes1) {
                    JButton botao = new JButton(orientacao.getTitulo());
                    botao.setAlignmentX(Component.CENTER_ALIGNMENT);
                    botao.setMaximumSize(new Dimension(245, 50));
                    botao.setFont(new Font("Arial", Font.BOLD, 14));
                    botao.setFocusPainted(false);
                    botao.setBackground(new Color(52, 152, 219));
                    botao.setForeground(Color.WHITE);
                    botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                    menuLateral1.add(botao);
                    menuLateral1.add(Box.createVerticalStrut(15));


                    botao.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {


                            mensagem1.setText("<html><body style='width: 700px'>" + orientacao.getDescricao() + "</body></html>");
                            mensagem1.setFont(new Font("Arial", Font.BOLD, 22));
                            mensagem1.setAlignmentX(Component.CENTER_ALIGNMENT);
                            mensagem1.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                            mensagem1.setBackground(Color.WHITE);

                            mensagem1.setVisible(true);

                        }
                    });
                }


                menuLateral1.add(Box.createVerticalStrut(535));
                JButton botaoRetornar = new JButton("Retornar");
                botaoRetornar.setAlignmentX(Component.CENTER_ALIGNMENT);
                botaoRetornar.setMaximumSize(new Dimension(245, 50));
                botaoRetornar.setFont(new Font("Arial", Font.BOLD, 14));
                botaoRetornar.setFocusPainted(false);
                botaoRetornar.setBackground(new Color(52, 152, 219));
                botaoRetornar.setForeground(Color.WHITE);
                botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                menuLateral1.add(botaoRetornar);




                botaoRetornar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        menuLateral1.setVisible(false);
                        menuLateral.setVisible(true);
                        mensagem1.setVisible(false);

                    }


                });
            }
        });


        JButton pasta2 = new JButton("Procedimento de Segurança");
        pasta2.setAlignmentX(Component.CENTER_ALIGNMENT);
        pasta2.setMaximumSize(new Dimension(180, 50));
        pasta2.setFont(new Font("Arial", Font.BOLD, 14));
        pasta2.setFocusPainted(false);
        pasta2.setBackground(new Color(52, 152, 219));
        pasta2.setForeground(Color.WHITE);
        pasta2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        pasta2.setBounds(14, 134, 240, 50);
        menuLateral.add(pasta2);


        pasta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JPanel menuLateral2 = new JPanel();
                menuLateral2.setBackground(new Color(0, 87, 156));
                menuLateral2.setLayout(new BoxLayout(menuLateral2, BoxLayout.Y_AXIS));
                menuLateral2.setPreferredSize(new Dimension(270, TelaPesquisar.getHeight()));



                TelaPesquisar.getContentPane().remove(menuLateral);
                TelaPesquisar.getContentPane().add(menuLateral2, BorderLayout.WEST);
                TelaPesquisar.revalidate();
                TelaPesquisar.repaint();
                menuLateral.setVisible(false);


                menuLateral2.add(Box.createVerticalStrut(69));


                ArrayList<Orientacao> orientacoes2 = new ArrayList<>();


                try (Connection conexao = DriverManager.getConnection("jdbc:mysql://yamanote.proxy.rlwy.net:40662/railway", "root", "kGYqssqFVqrEqdAnaWfGAUrQifPUxhxb")) {
                    String sql = "SELECT titulo, descricao FROM orientacoes WHERE tipo_id = 2";
                    PreparedStatement stmt = conexao.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();


                    while (rs.next()) {
                        String titulo2 = rs.getString("titulo");
                        String descricao2 = rs.getString("descricao");
                        orientacoes2.add(new Orientacao(titulo2, descricao2));
                    }


                    rs.close();
                    stmt.close();
                } catch (SQLException f) {
                    f.printStackTrace();
                }


                JLabel mensagem2 = new JLabel("");
                painelCentral.add(Box.createVerticalStrut(20));
                mensagem2.setHorizontalAlignment(SwingConstants.CENTER);
                mensagem2.setVerticalAlignment(SwingConstants.TOP);
                painelCentral.add(mensagem2, BorderLayout.NORTH);
                painelCentral.revalidate();
                painelCentral.repaint();

                for (Orientacao orientacao : orientacoes2) {
                    JButton botao = new JButton(orientacao.getTitulo());
                    botao.setAlignmentX(Component.CENTER_ALIGNMENT);
                    botao.setMaximumSize(new Dimension(245, 50));
                    botao.setFont(new Font("Arial", Font.BOLD, 14));
                    botao.setFocusPainted(false);
                    botao.setBackground(new Color(52, 152, 219));
                    botao.setForeground(Color.WHITE);
                    botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                    menuLateral2.add(botao);
                    menuLateral2.add(Box.createVerticalStrut(15));

                    botao.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {


                            mensagem2.setText("<html><body style='width: 700px'>" + orientacao.getDescricao() + "</body></html>");
                            mensagem2.setFont(new Font("Arial", Font.BOLD, 22));
                            mensagem2.setAlignmentX(Component.CENTER_ALIGNMENT);
                            mensagem2.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                            mensagem2.setBackground(Color.WHITE);

                            mensagem2.setVisible(true);

                        }
                    });
                }


                menuLateral2.add(Box.createVerticalStrut(535));
                JButton botaoRetornar = new JButton("Retornar");
                botaoRetornar.setAlignmentX(Component.CENTER_ALIGNMENT);
                botaoRetornar.setMaximumSize(new Dimension(245, 50));
                botaoRetornar.setFont(new Font("Arial", Font.BOLD, 14));
                botaoRetornar.setFocusPainted(false);
                botaoRetornar.setBackground(new Color(52, 152, 219));
                botaoRetornar.setForeground(Color.WHITE);
                botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                menuLateral2.add(botaoRetornar);


                botaoRetornar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        menuLateral2.setVisible(false);
                        menuLateral.setVisible(true);
                        mensagem2.setVisible(false);

                    }
                });


            }
        });


        JButton pasta3 = new JButton("Manutenção e Reparos");
        pasta3.setAlignmentX(Component.CENTER_ALIGNMENT);
        pasta3.setMaximumSize(new Dimension(180, 50));
        pasta3.setFont(new Font("Arial", Font.BOLD, 14));
        pasta3.setFocusPainted(false);
        pasta3.setBackground(new Color(52, 152, 219));
        pasta3.setForeground(Color.WHITE);
        pasta3.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        pasta3.setBounds(14, 199, 240, 50);
        menuLateral.add(pasta3);


        pasta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JPanel menuLateral3 = new JPanel();
                menuLateral3.setBackground(new Color(45, 62, 80));
                menuLateral3.setBackground(new Color(0, 87, 156));
                menuLateral3.setLayout(new BoxLayout(menuLateral3, BoxLayout.Y_AXIS));
                menuLateral3.setPreferredSize(new Dimension(270, TelaPesquisar.getHeight()));


                TelaPesquisar.add(menuLateral3, BorderLayout.WEST);
                menuLateral.setVisible(false);


                menuLateral3.add(Box.createVerticalStrut(69));


                ArrayList<String> opcoesPasta3 = new ArrayList<>();

                        try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/weg_one", "DanielAdmin", "246801@Weg")) {
                            String sql = "SELECT titulo FROM orientacoes WHERE tipo_id = 3";
                            PreparedStatement stmt = conexao.prepareStatement(sql);
                            ResultSet rs = stmt.executeQuery();


                    while (rs.next()) {
                        opcoesPasta3.add(rs.getString("titulo"));
                    }


                    rs.close();
                    stmt.close();
                } catch (SQLException f) {
                    f.printStackTrace();
                }


                for (String opcao : opcoesPasta3) {
                    JButton botao = new JButton(opcao);
                    botao.setAlignmentX(Component.CENTER_ALIGNMENT);
                    botao.setMaximumSize(new Dimension(245, 50));
                    botao.setFont(new Font("Arial", Font.BOLD, 14));
                    botao.setFocusPainted(false);
                    botao.setBackground(new Color(52, 152, 219));
                    botao.setForeground(Color.WHITE);
                    botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                    menuLateral3.add(botao);
                    menuLateral3.add(Box.createVerticalStrut(15));
                }


                menuLateral3.add(Box.createVerticalStrut(535));
                JButton botaoRetornar = new JButton("Retornar");
                botaoRetornar.setAlignmentX(Component.CENTER_ALIGNMENT);
                botaoRetornar.setMaximumSize(new Dimension(245, 50));
                botaoRetornar.setFont(new Font("Arial", Font.BOLD, 14));
                botaoRetornar.setFocusPainted(false);
                botaoRetornar.setBackground(new Color(52, 152, 219));
                botaoRetornar.setForeground(Color.WHITE);
                botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                menuLateral3.add(botaoRetornar);


                botaoRetornar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                        menuLateral.setVisible(true);
                        menuLateral3.setVisible(false);


                    }
                });


            }
        });


        String[] opcoesPasta4 = {
                "Botao 1",
                "Botao 2"


        };


        JButton pasta4 = new JButton("Testes e Diagnóstico");
        pasta4.setAlignmentX(Component.CENTER_ALIGNMENT);
        pasta4.setMaximumSize(new Dimension(180, 50));
        pasta4.setFont(new Font("Arial", Font.BOLD, 14));
        pasta4.setFocusPainted(false);
        pasta4.setBackground(new Color(52, 152, 219));
        pasta4.setForeground(Color.WHITE);
        pasta4.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        pasta4.setBounds(14, 264, 240, 50);
        menuLateral.add(pasta4);


        pasta4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JPanel menuLateral4 = new JPanel();
                menuLateral4.setBackground(new Color(45, 62, 80));
                menuLateral4.setBackground(new Color(0, 87, 156));
                menuLateral4.setLayout(new BoxLayout(menuLateral4, BoxLayout.Y_AXIS));
                menuLateral4.setPreferredSize(new Dimension(270, TelaPesquisar.getHeight()));


                TelaPesquisar.add(menuLateral4, BorderLayout.WEST);
                menuLateral.setVisible(false);


                menuLateral4.add(Box.createVerticalStrut(69));


                ArrayList<String> opcoesPasta4 = new ArrayList<>();

                        try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/weg_one", "DanielAdmin", "246801@Weg")) {
                            String sql = "SELECT titulo FROM orientacoes WHERE tipo_id = 4";
                            PreparedStatement stmt = conexao.prepareStatement(sql);
                            ResultSet rs = stmt.executeQuery();


                    while (rs.next()) {
                        opcoesPasta4.add(rs.getString("titulo"));
                    }


                    rs.close();
                    stmt.close();
                } catch (SQLException f) {
                    f.printStackTrace();
                }


                for (String opcao : opcoesPasta4) {
                    JButton botao = new JButton(opcao);
                    botao.setAlignmentX(Component.CENTER_ALIGNMENT);
                    botao.setMaximumSize(new Dimension(245, 50));
                    botao.setFont(new Font("Arial", Font.BOLD, 14));
                    botao.setFocusPainted(false);
                    botao.setBackground(new Color(52, 152, 219));
                    botao.setForeground(Color.WHITE);
                    botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                    menuLateral4.add(botao);
                    menuLateral4.add(Box.createVerticalStrut(15));
                }


                menuLateral4.add(Box.createVerticalStrut(535));
                JButton botaoRetornar = new JButton("Retornar");
                botaoRetornar.setAlignmentX(Component.CENTER_ALIGNMENT);
                botaoRetornar.setMaximumSize(new Dimension(245, 50));
                botaoRetornar.setFont(new Font("Arial", Font.BOLD, 14));
                botaoRetornar.setFocusPainted(false);
                botaoRetornar.setBackground(new Color(52, 152, 219));
                botaoRetornar.setForeground(Color.WHITE);
                botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                menuLateral4.add(botaoRetornar);


                botaoRetornar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                        menuLateral.setVisible(true);
                        menuLateral4.setVisible(false);


                    }
                });


            }
        });


        JButton pasta5 = new JButton("Manual de Conduta");
        pasta5.setAlignmentX(Component.CENTER_ALIGNMENT);
        pasta5.setMaximumSize(new Dimension(180, 50));
        pasta5.setFont(new Font("Arial", Font.BOLD, 14));
        pasta5.setFocusPainted(false);
        pasta5.setBackground(new Color(52, 152, 219));
        pasta5.setForeground(Color.WHITE);
        pasta5.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        pasta5.setBounds(14, 329, 240, 50);
        menuLateral.add(pasta5);


        pasta5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                pasta5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                        JPanel menuLateral5 = new JPanel();
                        menuLateral5.setBackground(new Color(45, 62, 80));
                        menuLateral5.setBackground(new Color(0, 87, 156));
                        menuLateral5.setLayout(new BoxLayout(menuLateral5, BoxLayout.Y_AXIS));
                        menuLateral5.setPreferredSize(new Dimension(270, TelaPesquisar.getHeight()));


                        TelaPesquisar.add(menuLateral5, BorderLayout.WEST);
                        menuLateral.setVisible(false);


                        menuLateral5.add(Box.createVerticalStrut(69));


                        ArrayList<String> opcoesPasta5 = new ArrayList<>();

                                try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/weg_one", "DanielAdmin", "246801@Weg")) {
                                    String sql = "SELECT titulo FROM orientacoes WHERE tipo_id = 5";
                                    PreparedStatement stmt = conexao.prepareStatement(sql);
                                    ResultSet rs = stmt.executeQuery();


                            while (rs.next()) {
                                opcoesPasta5.add(rs.getString("titulo"));
                            }


                            rs.close();
                            stmt.close();
                        } catch (SQLException f) {
                            f.printStackTrace();
                        }


                        for (String opcao : opcoesPasta5) {
                            JButton botao = new JButton(opcao);
                            botao.setAlignmentX(Component.CENTER_ALIGNMENT);
                            botao.setMaximumSize(new Dimension(245, 50));
                            botao.setFont(new Font("Arial", Font.BOLD, 14));
                            botao.setFocusPainted(false);
                            botao.setBackground(new Color(52, 152, 219));
                            botao.setForeground(Color.WHITE);
                            botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                            menuLateral5.add(botao);
                            menuLateral5.add(Box.createVerticalStrut(15));


                            botao.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {


                                    JLabel mensagem = new JLabel("Orientação");
                                    mensagem.setFont(new Font("Arial", Font.BOLD, 22));
                                    mensagem.setAlignmentX(Component.CENTER_ALIGNMENT);
                                    mensagem.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                                    mensagem.setBackground(Color.WHITE);

                                    painelCentral.add(mensagem);
                                    mensagem.setVisible(true);
                                    painelCentral.add(Box.createVerticalGlue());
                                }
                            });
                        }


                        menuLateral5.add(Box.createVerticalStrut(535));
                        JButton botaoRetornar = new JButton("Retornar");
                        botaoRetornar.setAlignmentX(Component.CENTER_ALIGNMENT);
                        botaoRetornar.setMaximumSize(new Dimension(245, 50));
                        botaoRetornar.setFont(new Font("Arial", Font.BOLD, 14));
                        botaoRetornar.setFocusPainted(false);
                        botaoRetornar.setBackground(new Color(52, 152, 219));
                        botaoRetornar.setForeground(Color.WHITE);
                        botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                        menuLateral5.add(botaoRetornar);


                        botaoRetornar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {


                                menuLateral.setVisible(true);
                                menuLateral5.setVisible(false);
                                menuLateral.setVisible(true);
                                menuLateral5.setVisible(true);


                            }


                        });
                    }
                });
            }
        });


        JPanel painelConteudo = new JPanel(new BorderLayout());
        painelConteudo.setBackground(new Color(255, 255, 255));


        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(0, 87, 156));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));


        JButton botao3Linhas = new JButton("☰");
        botao3Linhas.setFont(new Font("SansSerif", Font.BOLD, 30));
        botao3Linhas.setFocusPainted(false);
        botao3Linhas.setBackground(new Color(0, 87, 156));
        botao3Linhas.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botao3Linhas.setForeground(Color.WHITE);
        botao3Linhas.setBounds(-3, 0, 50, 30);
        botao3Linhas.setVisible(false);


        botao3Linhas.addActionListener(f -> {
            menuLateral.setVisible(true);
            botao3Linhas.setVisible(false);
            fecharMenu.setVisible(true);
            headerPanel.revalidate();
            headerPanel.repaint();
        });


        fecharMenu.addActionListener(f -> {
            menuLateral.setVisible(false);
            botao3Linhas.setVisible(true);
            fecharMenu.setVisible(false);
            headerPanel.revalidate();
            headerPanel.repaint();
        });


        JButton botaoIdioma = new JButton("\uD83C\uDDE7\uD83C\uDDF7");
        botaoIdioma.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoIdioma.setFocusPainted(false);
        botaoIdioma.setBackground(new Color(0, 87, 156));
        botaoIdioma.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botaoIdioma.setForeground(Color.WHITE);


        JButton botaoUsuario = new JButton("\uD83D\uDC64");
        botaoUsuario.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoUsuario.setFocusPainted(false);
        botaoUsuario.setBackground(new Color(0, 87, 156));
        botaoUsuario.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botaoUsuario.setForeground(Color.WHITE);
        botaoUsuario.setLayout(null);
        botao3Linhas.setBounds(30, 40, 50, 30);


        botaoUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });


        headerPanel.add(botao3Linhas, BorderLayout.WEST);
        headerPanel.add(Box.createHorizontalGlue());
        headerPanel.add(botaoUsuario, BorderLayout.EAST);
        headerPanel.add(botaoIdioma, BorderLayout.LINE_END);


        painelConteudo.add(headerPanel, BorderLayout.NORTH);


        JButton botaoRetornar = new JButton("Retornar");
        botaoRetornar.setFocusPainted(false);
        botaoRetornar.setBackground(new Color(52, 152, 219));
        botaoRetornar.setForeground(Color.WHITE);
        botaoRetornar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoRetornar.setLayout(null);
        botaoRetornar.setBounds(14, 734, 240, 50);
        menuLateral.add(botaoRetornar);


        botaoRetornar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                TelaPesquisar.setVisible(false);


            }
        });


        painelConteudo.add(painelCentral, BorderLayout.CENTER);


        boolean[] menuVisivel = {false};
        botao3Linhas.addActionListener(g -> {
            menuVisivel[0] = !menuVisivel[0];
            menuLateral.setVisible(menuVisivel[0]);
            TelaPesquisar.revalidate();
        });


        botaoIdioma.addActionListener(h -> {
            JOptionPane.showMessageDialog(TelaPesquisar, "Funcionalidade de pesquisa aqui.");
        });


        TelaPesquisar.add(menuLateral, BorderLayout.WEST);
        TelaPesquisar.add(painelConteudo, BorderLayout.CENTER);


        TelaPesquisar.setLocationRelativeTo(null);
        TelaPesquisar.setVisible(true);


    }


    public void ClickEditar() {


        JFrame telaDeEditar = new JFrame("Editar Orientação");
        telaDeEditar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaDeEditar.setSize(900, 600);
        telaDeEditar.setExtendedState(JFrame.MAXIMIZED_BOTH);
        telaDeEditar.setLayout(new BorderLayout());
        telaDeEditar.setVisible(true);


        JPanel menuLateral = new JPanel();
        menuLateral.setBackground(new Color(0, 87, 156));
        menuLateral.setLayout(new BoxLayout(menuLateral, BoxLayout.Y_AXIS));
        menuLateral.setPreferredSize(new Dimension(200, telaDeEditar.getHeight()));
        menuLateral.setVisible(false);


        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(0, 87, 156));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        telaDeEditar.add(headerPanel, BorderLayout.NORTH);


        JButton botaoIdioma = new JButton("\uD83C\uDF10");
        botaoIdioma.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoIdioma.setFocusPainted(false);
        botaoIdioma.setBackground(new Color(0, 87, 156));
        botaoIdioma.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botaoIdioma.setForeground(Color.WHITE);
        headerPanel.add(botaoIdioma, BorderLayout.EAST);


        JButton botaoVoltar = new JButton("◀\uFE0F");
        botaoVoltar.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoVoltar.setBackground(new Color(0, 87, 156));
        botaoVoltar.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botaoVoltar.setFocusPainted(false);
        botaoVoltar.setForeground(new Color(255, 255, 255));
        headerPanel.add(botaoVoltar, BorderLayout.WEST);
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                telaDeEditar.setVisible(false);


            }
        });
    }


    public void ClickExcluir() {


        JFrame telaDeExcluir = new JFrame("Excluir Orientação");
        telaDeExcluir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaDeExcluir.setSize(900, 600);
        telaDeExcluir.setExtendedState(JFrame.MAXIMIZED_BOTH);
        telaDeExcluir.setLayout(new BorderLayout());
        telaDeExcluir.setVisible(true);


        JPanel menuLateral = new JPanel();
        menuLateral.setBackground(new Color(0, 87, 156));
        menuLateral.setLayout(new BoxLayout(menuLateral, BoxLayout.Y_AXIS));
        menuLateral.setPreferredSize(new Dimension(200, telaDeExcluir.getHeight()));
        menuLateral.setVisible(false);


        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(0, 87, 156));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        telaDeExcluir.add(headerPanel, BorderLayout.NORTH);


        JButton botaoIdioma = new JButton("\uD83C\uDF10");
        botaoIdioma.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoIdioma.setFocusPainted(false);
        botaoIdioma.setBackground(new Color(0, 87, 156));
        botaoIdioma.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botaoIdioma.setForeground(Color.WHITE);
        headerPanel.add(botaoIdioma, BorderLayout.EAST);


        JButton botaoVoltar = new JButton("◀\uFE0F");
        botaoVoltar.setFont(new Font("SansSerif", Font.PLAIN, 30));
        botaoVoltar.setBackground(new Color(0, 87, 156));
        botaoVoltar.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        botaoVoltar.setFocusPainted(false);
        botaoVoltar.setForeground(new Color(255, 255, 255));
        headerPanel.add(botaoVoltar, BorderLayout.WEST);
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                telaDeExcluir.setVisible(false);


            }
        });
    }


    public void ClickSair() {
        System.exit(0);
    }

    public class Orientacao {
        private String titulo;
        private String descricao;

        public Orientacao(String titulo, String descricao) {
            this.titulo = titulo;
            this.descricao = descricao;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getDescricao() {
            return descricao;
        }
    }


}











































