import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageDeleteEvent;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageEditEvent;
import sx.blah.discord.handle.impl.events.guild.member.UserBanEvent;
import sx.blah.discord.handle.impl.events.guild.member.UserJoinEvent;
import sx.blah.discord.handle.impl.events.guild.member.UserLeaveEvent;

public class MyEvents
{

    @EventSubscriber
    public void messageDelete(MessageDeleteEvent event)
    {
        BotUtils.sendMessage(event.getGuild().getChannelByID(439402645489451008L),event.getAuthor().getName()+"'s message has been deleted in "+event.getChannel()+"\n```diff\n-"+event.getMessage()+"\n```");
    }
    @EventSubscriber
    public void messageEdit(MessageEditEvent event)
    {
        BotUtils.sendMessage(event.getGuild().getChannelByID(439402645489451008L),event.getAuthor().getName()+" has edited their message in "+event.getChannel()+"\n```diff\n-"+event.getOldMessage()+"\n+"+event.getNewMessage()+"\n```");
    }
    @EventSubscriber
    public void userJoin(UserJoinEvent event)
    {
        BotUtils.sendMessage(event.getGuild().getChannelByID(351789748915929099L),"Welcome "event.getUser()+" to Mikanland! Please read the "+event.getGuild().getChannelByID(387684786015174677L)+" and introduce yourself in this channel so you can access the rest of the server~ Have fun!!");
        BotUtils.sendMessage(event.getGuild().getChannelByID(439402726099517471L),event.getUser().getName()+" has joined the server.");
    }
    @EventSubscriber
    public void userLeave(UserLeaveEvent event)
    {
        BotUtils.sendMessage(event.getGuild().getChannelByID(439402726099517471L),event.getUser().getName()+" has left the server.");
    }
    @EventSubscriber
    public void userBan(UserBanEvent event)
    {
        BotUtils.sendMessage(event.getGuild().getChannelByID(439402726099517471L),event.getUser().getName()+" has been banned from the server.");
    }
}