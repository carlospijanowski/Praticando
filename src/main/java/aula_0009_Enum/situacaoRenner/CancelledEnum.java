package aula_0009_Enum.situacaoRenner;

import lombok.Data;
import lombok.Getter;

@Getter
public enum CancelledEnum {


    RECUSADO_PELO_CLIENTE(1L,"recusado pelo cliente",true, true),
    CLIENTE_AUSENTE (2L,"cliente ausente",true, false);

    private Long numeroRecusa;
    private String motivo;
    private boolean notifica;
    private boolean finaliza;

    CancelledEnum(Long numeroRecusa, String motivo, boolean notifica, boolean finaliza) {
        this.numeroRecusa = numeroRecusa;
        this.motivo = motivo;
        this.notifica = notifica;
        this.finaliza = finaliza;
    }

    public static CancelledEnum getEnum(Long numeroRecusa){

        for (CancelledEnum cancelledEnum : CancelledEnum.values()){
            if(cancelledEnum.numeroRecusa.equals(numeroRecusa)){
                return cancelledEnum;
            }
        }

        return null;
    }
}
