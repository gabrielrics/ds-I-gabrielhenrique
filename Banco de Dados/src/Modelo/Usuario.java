package Modelo;


public class Usuario {

     Long id;
        String nome, cpf, email, telefone;
        
        public String getCpf(){
            return cpf;
        }
        
                public void setCpf(String cpf){
                    this.cpf = cpf;
                }
        
        public String getEmail(){
            return email;
        }
        
                public void setEmail(String email){
                    this.email = email;
                }
            
        public Long getId(){
            return id;
        }
        
                public void setNome(String nome){
                    this.nome = nome;
                }
        
        public String getTelefone(){
            return telefone;
        }
        
        public void setTelefone(String telefone){
            this.telefone = telefone;
        }

    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
                
    
    }

