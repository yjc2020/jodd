PRJ_ROOT=../../../../../../

java -jar $PRJ_ROOT/etc/jflex/JFlex-1.5.jar -d . lexer.flex

mv Lexer.java ../../../java/jodd/lagarto/

echo done!