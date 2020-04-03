# calculadora

## Para testar

```
mvn test
```

## Para execuar

```
mvn spring-boot:run
```
### Doc

A URL do serviço é GET e tem como Path Parameters o valor e a quantidade de parcelas.

http://localhost:8080/calcular/{valor}/{parcelas}

### Próximos passos

1. Implementar a segurança da API
2. Criar uma imagem no Docker para a API
3. Subir o container da imagem em um serviço de cloud
4. Revisar e refatorar o código :D
