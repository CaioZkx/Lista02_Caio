package List2;

public class Utilidades {
	
	//Questao 1
	public int somatorio(int[] vet) {
		
		int soma = 0;
		for (int i = 2; i < vet.length - 2; i++) {
			soma = soma + vet[i];
		}
		return soma;
	}
	
	//Questao 2
	public void Numerospares(int start, int end) {
		
		for (int i = start; i <= end; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	//Questao 3
	public float media(int[] vet1, int[] vet2) {
		
		float media = 0;
		int soma1 = 0, soma2 = 0;
		
		for (int i = 0; i < vet1.length; i++) {
			soma1 = soma1 + vet1[i];
		}
		for (int i = 0; i < vet2.length; i++) {
			soma2 = soma2 + vet2[i];
		}
		
		media = (soma1 + soma2) / vet1.length + vet2.length; 
		return media;	
	}
	
	//Questao 4
	public float mediaponderada(float[] notas, float[] pesos) {
		float soma=0, soma2=0, mediapond=0; 
		for (int i = 0; i < pesos.length; i++) {
			soma = soma + (notas[i] * pesos[i]);
			soma2 = soma2 + pesos[i];
		}
		mediapond = soma / soma2;
		return mediapond;
	}
	
	//Questao 5
	public int contagemdeelementos(int[] vet1, int[] vet2, int num) {
		
		int cont = 0;
		
		for (int i = 0; i < vet1.length; i++) {
			if(num == vet1[i]) {
				cont++;
			}	
		}
		for (int i = 0; i < vet2.length; i++) {
			if(num == vet2[i]) {
				cont++;
			}
	    }
		return cont;		
	}
	
	//Questao 6
	public float[] copiavet(float[] vet) {
	    float[] vetcop = new float[vet.length];
	    
	    for (int i = 0; i < vet.length; i++) {
	        vetcop[i] = vet[i];
	    }
	    
	    return vetcop;
	}
	
	//Questao 7
	public float[] OrdenacaoCres(float[] vet) {

	    for (int i = 0; i < vet.length - 1; i++) {
	        int menorvalor = i;

	        for (int j = i + 1; j < vet.length; j++) {
	            if (vet[j] < vet[menorvalor]) {
	            	menorvalor = j;
	            }
	        }
	        
	        float temp = vet[menorvalor];
	        vet[menorvalor] = vet[i];
	        vet[i] = temp;
	    }

	    return vet;
	}
	
	//questao 8
	public boolean Verificacao(float[] vet) {
	    for (int i = 0; i < vet.length - 1; i++) {
	        if (vet[i] > vet[i + 1]) {
	            return false;
	        }
	    }
	    return true;
	}
	
	//Metodo extra para ordenacao decrescente que sera usada na questao 9
	public float[] OrdenacaoDecres(float[] vet) {

	    for (int i = 0; i < vet.length - 1; i++) {
	        int maiorvalor = i;

	        for (int j = i + 1; j < vet.length; j++) {
	            if (vet[j] > vet[maiorvalor]) {
	            	maiorvalor = j;
	            }
	        }
	        
	        float temp = vet[maiorvalor];
	        vet[maiorvalor] = vet[i];
	        vet[i] = temp;
	    }

	    return vet;
	}
	
	//questao 9
	public float Kesimomaior(float[] vet, int K){
		float[] vet2 = OrdenacaoDecres(vet);
		
		return vet2[K - 1];
	}
	
	//questao 10
	public float Kesimomenor(float[] vet, int K) {
		float[] vet2 = OrdenacaoCres(vet);
		
		return vet2[K - 1];
	}
	
	//questao 11
	public void Igualdade(float[] vet1, float[] vet2) {
		for (int i = 0; i < vet1.length; i++) {
			if(vet1[i] != vet2[i]) {
				System.out.println("Nao sao iguais");
				return;
			}
		}
		System.out.println("Sao iguais");
	}
	
	//questao 12
	public int Potenciacao(int base, int exp) {
		int j = base;
		
		if(exp == 0) return 1;
		
		for (int i = 1; i < exp; i++) {
			base = base * j;
		}
		return base;
	}
	
	//questao 13
	public void primo(int a) {
		if(a == 2 || a == 3 || a == 5) System.out.println("Eh primo");
		else if(a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a == 1) System.out.println("Nao eh primo");
		else System.out.println("Eh primo");
	}
	
	//questao 14
//	public float[] ocorrencia(float[] vet1, float[] vet2) {
//		float[] vet3 = new float[4];
//		
//		for (int i = 0; i < vet1.length; i++) {
//			for (int j = 0; j < vet1.length; j++) {
//				if(vet1[i] == vet2[i]) {
//					vet3[i] = vet1[i];
//				}
//			}
//		}
//		return vet3;
//	}
	
	//questao 15
	public float[] remocao(float[] vet, float K) {
		int cont = 0;
		
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] == K) 
				cont++;
		}
		float[] vet2 = new float[vet.length - cont];
		int j = 0;
		
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] != K) {
				vet2[j] = vet[i];
				j++;
			}
		}
		return vet2;
	}
	
	//questao 16
	public boolean palindromo(String palavra) {

        int tamanho = palavra.length();
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - i - 1)) {
                return false;
            }
        }

        return true;
    }
	
	//questao 17
	public boolean verifcarPrimo(int a) {
		if(a == 2 || a == 3 || a == 5) return true;
		else if(a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a == 1) return false;
		else return true;
	}
	
	//questao 18
	public static String inverterString(String palavra) {
        char[] letras = palavra.toCharArray();
        int tamanho = letras.length;

        for (int i = 0; i < tamanho / 2; i++) {
            char temp = letras[i];
            letras[i] = letras[tamanho - i - 1];
            letras[tamanho - i - 1] = temp;
        }

        return new String(letras);
    }
	
	//questao 19
	public double JurosCompostos(double valorInicial, double taxa, int tempo) {
        
        double valorFinal = valorInicial;
        for (int i = 0; i < tempo; i++) {
            valorFinal *= (1 + taxa);
        }

        return valorFinal;
    }
	
	//questao 20
	public boolean numeroPerfeito(int numero) {
        if (numero <= 1) {
            return false;
        }
        int somaDivisores = 1;
        for (int divisor = 2; divisor * divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                somaDivisores += divisor;
                int divisor2 = numero / divisor;
                if (divisor2 != divisor) {
                    somaDivisores += divisor2;
                }
            }
        }

        return somaDivisores == numero;
    }
	
	//questao 22 
	
	//a)
	public void TrianguloDeNumerus(int linhas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
	
	//b
	public void quadrado(int linhas, int colunas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("@ ");
                }
            }
            System.out.println();
        }
    }
	
	//c
	public void quadrado2(int linhas, int colunas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j == 2) {
                    System.out.print("@ ");
                } else if(i == 2) {
                    System.out.print("@ ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
	
	
	//d
	public void quadrado3(int linhas, int colunas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == 0 || i == linhas - 1 || j == 0 || j == colunas - 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
	}   
	
	//e
	public void quadrado4(int linhas, int colunas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else if( i + j == linhas + 1) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
               
            }
            System.out.println();
        }
    }
}