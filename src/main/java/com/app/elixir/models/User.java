package com.app.elixir.models;
import javax.persistence.Entity; //Deixa criar entidade
import javax.persistence.GEneratedValue; //Chama a biblioteca  Generated value
import javax.persistence.GenerationType;//Chama a biblioteca GenerationType
import javax.persistence.id;//Chama a biblioteca para poder fazer uma PK


@Entity //Denomina que User é uma tabela
@Table = (name "user") // Muda o nome da tabela
public class User{
    @id //Cria a chave primaria = PRIMARY KEY(id)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // faz com que a PK não seja nula e vai ser sequencial, sendo único e não fazendo dois id's iguais pra não dar erro
    private long id;
      
    @Column(name="email", nullable = false, unique = true) //NÃO deixa ser nulo. Tenho que fazer pra cada entidade se quiser que todas NÃO sejam nulas. EEEEE FALA QUE ELE TEM QUE SER ÚNICO!
        private String email;
    @Column(name="first_name", nullable = false)
        private String first_name;
    @Column(name="last_name", nullable = false)
        private String last_name;
    @Column(name="password", nullable = false)
        private String password;
    @Column(name="code_verify", nullable = false)
        private String code_verify;
    @Column(name="data_register", nullable = false)
        private String data_register;
    @Column(name="is_superuser", default = false, nullable = false)
        private boolean is_superuser;
    @Column(name="is_verify", default = false, nullable = false)
        private boolean is_verify;
      
      
    @Deprecated //Não estamos usando de verdade, está por padrão
    public User() { } //Ferramenta que o Spring usa precisa ter uma classe vazia, por exigência

    public User(String email, String first_name, String last_name, String password, String code_verify, String data_register, boolean is_superuser, boolean is_verify){
        this.setEmail(email);
        this.setFirst_name(first_name);
        this.setLast_name(last_name);
        this.setPassword(password);
        this.setCode_verify(code_verify);
        this.setData_register(data_register);
        this.setIs_superuser(is_superuser);
        this.setIs_verify(is_verify);
    } 

    public User(String email, String first_name, String last_name, String password, String code_verify, String data_register){
        this.setEmail(email);
        this.setFirst_name(first_name);
        this.setLast_name(last_name);
        this.setPassword(password);
        this.setCode_verify(code_verify);
        this.setData_register(data_register);
    } 


    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode_verify() {
        return code_verify;
    }
    public void setCode_verify(String code_verify) {
        this.code_verify = code_verify;
    }

    public String getData_register() {
        return data_register;
    }
    public void setData_register(String data_register) {
        this.data_register = data_register;
    }

    public boolean isIs_superuser() {
        return is_superuser;
    }
    public void setIs_superuser(boolean is_superuser) {
        this.is_superuser = is_superuser;
    }

    public boolean isIs_verify() {
        return is_verify;
    }
    public void setIs_verify(boolean is_verify) {
        this.is_verify = is_verify;
    }
}
