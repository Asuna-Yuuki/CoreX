package cn.nukkit.network.protocol;

public class ModalFormRequestPacket extends DataPacket {

    public int formId;
    public String data;

    @Override
    public byte pid() {
        return ProtocolInfo.MODAL_FORM_REQUEST_PACKET;
    }

    @Override
    public void decode() {
        this.formId = (int) this.getUnsignedVarInt();
        this.data = this.getString();

    }

    @Override
    public void encode() {
        this.reset();
        this.putUnsignedVarInt(this.formId);
        this.putString(this.data);
    }
}
