package jm.tasks.exceptions.task437;
/*
Inspector – Инспектор, который следит за запрещенными и украденными посылками и бьет тревогу в виде исключения,
если была обнаружена подобная посылка. Если он заметил запрещенную посылку с одним из запрещенных содержимым
("weapons" и "banned substance"), то он бросает IllegalPackageException. Если он находит посылку, состоящую из камней
(содержит слово "stones"), то тревога прозвучит в виде StolenPackageException. Оба исключения вы должны объявить
самостоятельно в виде непроверяемых исключений.
 */
public class Inspector implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            Package content = ((MailPackage) mail).getContent();
            if (content.getContent().contains("weapons") || content.getContent().contains("banned substance")) {
                throw new IllegalPackageException();
            } else if (content.getContent().contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
