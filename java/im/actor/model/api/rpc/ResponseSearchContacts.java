package im.actor.model.api.rpc;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.Bser;
import im.actor.model.droidkit.bser.BserParser;
import im.actor.model.droidkit.bser.BserObject;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import im.actor.model.droidkit.bser.DataInput;
import static im.actor.model.droidkit.bser.Utils.*;
import java.io.IOException;
import im.actor.model.network.parser.*;
import java.util.List;
import java.util.ArrayList;
import im.actor.model.api.*;

public class ResponseSearchContacts extends Response {

    public static final int HEADER = 0x71;
    public static ResponseSearchContacts fromBytes(byte[] data) throws IOException {
        return Bser.parse(new ResponseSearchContacts(), data);
    }

    private List<User> users;

    public ResponseSearchContacts(List<User> users) {
        this.users = users;
    }

    public ResponseSearchContacts() {

    }

    public List<User> getUsers() {
        return this.users;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        List<User> _users = new ArrayList<User>();
        for (int i = 0; i < values.getRepeatedCount(1); i ++) {
            _users.add(new User());
        }
        this.users = values.getRepeatedObj(1, _users);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeRepeatedObj(1, this.users);
    }

    @Override
    public String toString() {
        String res = "tuple SearchContacts{";
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}