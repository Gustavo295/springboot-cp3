package br.com.fiap.api_rest.repository;

import br.com.fiap.api_rest.model.Categoria;
import br.com.fiap.api_rest.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNome(String nome);
    Cliente findByCpf(String cpf);
    List<Cliente> findByNomeEqualsIgnoreCase(String nome);
    List<Cliente> findByNomeIsNot(String nome);
    List<Cliente> findByIsbnIsNull();
    List<Cliente> findByNomeStartingWith(String prefix);
    List<Cliente> findByEmailLike(String likePattern);
    List<Cliente> findTop3ByIdade(int idade);
    List<Cliente> findByIdadeGreaterThan(double idade);
    List<Cliente> findByNomeOrCpf(String nome, String cpf);
    List<Cliente> findByNomeOrderByNome(String nome);
    List<Cliente> findByDataNascimentoBefore(Date dataNascimento);
    List<Cliente> findByVipFalse();
}
