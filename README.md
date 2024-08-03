# Shell Scripts file support on NetBeans IDE

## Otimize seus scripts Bash no NetBeans!

Este plugin oferece uma experiência aprimorada para desenvolvedores que trabalham com scripts Bash no NetBeans IDE. Com recursos como destaque de sintaxe, autocompletação e execução direta, você pode escrever seus scripts de forma mais eficiente e produtiva.

### Recursos

* **Destaque de Sintaxe:** Codifique seus scripts com clareza, graças à realça de sintaxe personalizada para Bash.
* **Autocompletação Inteligente:** Aumente sua produtividade com a sugestão automática de comandos, opções e variáveis.
* **Execução Direta:** Execute seus scripts diretamente do NetBeans com um simples clique.
* **Compatibilidade:** Totalmente compatível com NetBeans 22 e JDK 21.

### Como usar
1. **Instale o plugin:** Tools > Plugins > Downloaded > Add Plugins > Selecione o arquivo nbm compilado deste projeto.
2. **Crie um novo arquivo:** Selecione "Shell Script Template" como o tipo de arquivo.
3. **Comece a codificar:** Aproveite os recursos de destaque de sintaxe e autocompletação.
4. **Execute seu script:** Clique com o botão direito no arquivo e selecione "Run File".

### Configuração de Variáveis de Ambiente
Para configurar variáveis de ambiente, adicione as linhas necessárias no início do seu script, como no exemplo abaixo:

```bash
#!/bin/bash

# Configurando variáveis de ambiente
export PATH=/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin

# Seu script aqui
echo "Hello, world!"
```

*   Syntax Highlighting
*   Simple autocompletion
*   Run Script File

#### Note: ####

Currently no environment variable exists when executing the file with Right Click "Run File" context menu option. So if you need an environment variable be sure to set it up at the beginning of the Execution like below:

```shell
echo "Starting to do something"
export PATH=/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin
....
echo "finished ..."
```
