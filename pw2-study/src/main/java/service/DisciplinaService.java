package service;

import org.springframework.beans.factory.annotation.Autowired;
import repository.DisciplinaRepository;

public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;
    public void cadastrarDisciplina(Disciplina disciplina){
        repository.save(disciplina);

    }
}
