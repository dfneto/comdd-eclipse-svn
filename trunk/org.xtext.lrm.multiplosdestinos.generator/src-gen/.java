		package
	 

	void read_file_destinos()
	{
	    arquivoDeCoordenadas = fopen(NOME_ARQUIVO_LISTA_COORDENADAS,"rt");
	    if (arquivoDeCoordenadas == NULL)
	    {
	        printf("\nNao achei arquivo %s\n", NOME_ARQUIVO_LISTA_COORDENADAS);
	        exit(0);
	    }
	
	    int i=0;
	
	    while(!feof(arquivoDeCoordenadas))
	    {
	        fscanf(arquivoDeCoordenadas,"%lf",&destino[i].UTM_X_Leste_Oeste);
	        fscanf(arquivoDeCoordenadas,"%lf",&destino[i].UTM_Y_Norte_Sul);
	        fscanf(arquivoDeCoordenadas,"%d",&destino[i].id_lido);
	        i++;
	
	        if (i >= QTD_MAX_DESTINOS)
	        {
	            printf("\nTamanho maximo atingido, aumente tamanho do vetor de destinos\n");
	            exit (0);
	        }
	    }
	}

	