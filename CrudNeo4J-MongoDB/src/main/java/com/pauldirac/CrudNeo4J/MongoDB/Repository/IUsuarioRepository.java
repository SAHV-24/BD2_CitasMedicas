package com.pauldirac.CrudNeo4J.MongoDB.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.pauldirac.CrudNeo4J.MongoDB.Model.UsuarioModel;

public interface IUsuarioRepository extends MongoRepository<UsuarioModel, ObjectId> {

}
