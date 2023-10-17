# JavaFX Project
Projeto JavaFX de exemplo usando Maven.

## Como executar

Fazer o clone do repositório.

Remover a pasta .git:
```bash
rm -rf .git
```

Iniciar um repositório git, fazer commits e enviar para o seu repositório remoto.


Nos laboratórios de informática do IFSP é necessário configurar o proxy para o funcionamento do maven:

```bash
export JAVA_TOOL_OPTIONS="-Djava.net.useSystemProxies=true"
```

No mesmo terminal que foi configurado o proxy executar o comando:
```bash
./mvnw javafx:run
```
