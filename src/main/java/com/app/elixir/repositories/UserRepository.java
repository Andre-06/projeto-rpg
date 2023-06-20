import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{ // CrudRepository = Dá a possibilidade de inserir, visualizar, criar e deletar dados das tabelas.       <tabela que estamos referenziando, tipo da chave primária>
    
    //Create/Update
    <UserS extends User> save(UserS user);

    //Read
    List<User> findAll();

    User findById(long id);

    //Delete
    void delete(User user);
    

       
}