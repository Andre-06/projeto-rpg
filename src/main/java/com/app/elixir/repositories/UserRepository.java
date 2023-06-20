import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository

@Repository
public interface UserRepository extends CrudRepository<User, int>{ // CrudRepository = Dá a possibilidade de inserir, visualizar, criar e deletar dados das tabelas.       <tabela que estamos referenziando, tipo da chave primária>

       
}