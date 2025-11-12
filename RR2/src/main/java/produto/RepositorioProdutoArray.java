package produto;

public class RepositorioProdutoArray implements RepositorioProduto{

    private Produto[] produtos;
    private int index = -1;

    public RepositorioProdutoArray(int size) {
        super();
        this.produtos = new Produto[size];
    }

    private int procurarIndice(int codigo) {
        for (int i = 0; i <= this.index; i++) {
            if (this.produtos[i] != null) {
                if (this.produtos[i].getCodigo() == codigo) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean existe(int codigo) {
        return procurarIndice(codigo) != -1;
    }

    public void inserir(Produto produto) {
        this.index = this.index + 1;

        if (this.index < this.produtos.length) {
            this.produtos[this.index] = produto;
        } else {
            this.index = this.index - 1;
            throw new RuntimeException("Erro: Repositório de produtos está cheio!");
        }
    }

    public void atualizar(Produto produto) {
        int indexParaAtualizar = procurarIndice(produto.getCodigo());

        if (indexParaAtualizar != -1) {
            this.produtos[indexParaAtualizar] = produto;
        } else {
            throw new RuntimeException("Erro: Produto com código " + produto.getCodigo() + " não existe no repositório.");
        }
    }

    public void remover(int codigo) {
        int indexParaRemover = procurarIndice(codigo);

        if (indexParaRemover != -1) {
            for (int i = indexParaRemover; i < this.index; i++) {
                this.produtos[i] = this.produtos[i + 1];
            }
            
            this.produtos[this.index] = null;
            this.index = this.index - 1;

        } else {
            throw new RuntimeException("Erro: Produto com código " + codigo + " não existe no repositório.");
        }
    }

    public Produto procurar(int codigo) {
        int indexEncontrado = procurarIndice(codigo);

        if (indexEncontrado != -1) {
            return this.produtos[indexEncontrado];
        } else {
            throw new RuntimeException("Erro: Produto com código " + codigo + " não existe no repositório.");
        }
    }
}