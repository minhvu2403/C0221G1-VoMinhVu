
$(document).ready(function () {

    //********** menu background color change while scroll

    $(window).on('scroll', function () {
        let menu_area = $('.header');
        if ($(window).scrollTop() > 50) {
            menu_area.addClass('sticky-navigation');
        } else {
            menu_area.removeClass('sticky-navigation');
        }
    });

    $(function () {
         $('li').click(function () {
             $('.active').removeClass();
             $('this').addClass('.show1');
         });
    });

});







