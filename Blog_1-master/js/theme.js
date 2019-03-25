/*------------------------------------------------------------------
[Table of contents]

- Project:	GoodFood - HTML Template
- Version:	1.1
- Author:  Andrey Sokoltsov
- Profile:	http://themeforest.net/user/andreysokoltsov
--*/

(function () {

    "use strict";

    var Core = {

        initialized: false,

        initialize: function () {

            if (this.initialized) return;
            this.initialized = true;

            this.build();

        },

        build: function () {

            // Page preloader
            this.initPagePreloader();

            // Search Field Animation
            this.initSearchAnimation();

            // Menu Switcher
            this.mainMenuSwitcher();

            // hide Switcher
            this.hideMenuSwitcher();

            //Tabs Custom
            this.initTabsCustom();

            // Smooth Anchor
            this.initSmoothAnchor();

            // Toastr
            this.initToastr();

            // Change grid/list view
            this.gridlistView();

            // Owl Carousel
            this.initOwlCarousel();

            // Main Slider
            this.initMainSlider();

        },

        initPagePreloader: function (options) {
            var $preloader = $('#page-preloader'),
                $spinner = $preloader.find('.spinner-loader');
            $(window).on('load', function () {
                $spinner.fadeOut();
                $preloader.delay(500).fadeOut('slow');
                window.scrollTo(0, 0);
            });
        },

        initSearchAnimation: function (options) {
            $(".iconSearch").on('click', function (e) {
                e.preventDefault();
                $('.nav-holder ul').toggleClass('open-search');
            });

            $(document).on('click', 'body', function (event) {
                if ($(event.target).closest(".nav-holder ul").length) return;
                $(".nav-holder ul").removeClass("open-search");
                event.stopPropagation();
            });

        },

        mainMenuSwitcher: function (options) {
            $(document).on('click', '.hamburger', function () {
                $(this).toggleClass('is-active');
                $('body').toggleClass('open-menu');
            })
        },

        hideMenuSwitcher: function (options) {
            $(document).on('click', '.close-menu-nav', function () {
                $('.hamburger').toggleClass('is-active');
                $('body').removeClass('open-menu');
            });
        },

        initTabsCustom: function (options) {
            $('.b-tab li').on('click', 'a', function (e) {
                e.preventDefault()
                $(this).tab('show')
            })
        },

        initSmoothAnchor: function (options) {
            var $page = $('html, body');
            $('.offer-book').on('click', 'a[href*="#"]', function () {
                $page.animate({
                    scrollTop: $($.attr(this, 'href')).offset().top
                }, 500);
                return false;
            });
        },

        initToastr: function () {
            toastr.options.positionClass = 'toast-top-right';
        },

        gridlistView: function (options) {
            var $btnView = $(".b-view");
            $btnView.on('click', '.toogle-view', function (e) {
                e.preventDefault();
                $(".b-view .toogle-view").removeClass('active-view');
                $(this).addClass('active-view');
            });

            $btnView.on('click', '.view-grid', function (e) {
                e.preventDefault();
                $(".b-grid").removeClass('b-grid-list');
            });

            $btnView.on('click', '.view-list', function (e) {
                e.preventDefault();
                $(".b-grid").addClass('b-grid-list');
            });
        },

        initOwlCarousel: function (options) {
            var owlCarouselBox = $('.enable-owl-carousel');
            if (owlCarouselBox && owlCarouselBox.length) {
                owlCarouselBox.each(function (i) {
                    var $owl = $(this);

                    var autoplayData = $owl.data('autoplay');
                    var autoplayTimeoutData = $owl.data('autoplayTimeout');
                    var autoplayHoverPauseData = $owl.data('autoplayHoverPause');
                    var loopData = $owl.data('loop');
                    var slideByData = $owl.data('slideBy');
                    var autoWidthData = $owl.data('auto-width');
                    var dotsData = $owl.data('dots');
                    var navData = $owl.data('nav');
                    var marginData = $owl.data('margin');
                    var responsiveClassData = $owl.data('responsive-class');
                    var responsiveData = $owl.data('responsive');
                    var sliderNext = $owl.data('slider-next');
                    var sliderPrev = $owl.data('slider-prev');

                    $owl.owlCarousel({
                        autoplay: autoplayData,
                        autoplayTimeout: autoplayTimeoutData,
                        autoplayHoverPause: autoplayHoverPauseData,
                        loop: loopData,
                        slideBy: slideByData,
                        autoWidth: autoWidthData,
                        dots: dotsData,
                        nav: navData,
                        margin: marginData,
                        responsiveClass: responsiveClassData,
                        responsive: responsiveData,
                    });
                    $(document).on('click', sliderNext, function () {
                        $owl.trigger('next.owl.carousel');
                    });
                    $(document).on('click', sliderPrev, function () {
                        $owl.trigger('prev.owl.carousel');
                    });
                });
            }
        },

        initMainSlider: function (options) {
            var $mainSlider = $('.full-width-slider');
            if ($mainSlider && $mainSlider.length) {
                $mainSlider.each(function (i) {
                    var $proSlider = $(this);

                    var widthData = $proSlider.data('width');
                    var heightData = $proSlider.data('height');
                    var fadeData = $proSlider.data('fade');
                    var buttonsData = $proSlider.data('buttons');
                    var arrowsData = $proSlider.data('arrows');
                    var waitForLayersData = $proSlider.data('wait-for-layers');
                    var thumbnailPointerData = $proSlider.data('thumbnail-pointer');
                    var touchSwipeData = $proSlider.data('touch-swipe');
                    var autoplayData = $proSlider.data('autoplay');
                    var autoScaleLayersData = $proSlider.data('auto-scale-layers');
                    var visibleSizeData = $proSlider.data('visible-size');
                    var forceSizeData = $proSlider.data('force-size');
                    var autoplayDelayData = $proSlider.data('autoplay-delay');
                    var proNext = $proSlider.data('next-slide');
                    var proPrev = $proSlider.data('previous-slide');

                    $proSlider.sliderPro({
                        width: widthData,
                        height: heightData,
                        fade: fadeData,
                        buttons: buttonsData,
                        arrows: arrowsData,
                        waitForLayers: waitForLayersData,
                        thumbnailPointer: thumbnailPointerData,
                        touchSwipe: touchSwipeData,
                        autoplay: autoplayData,
                        autoScaleLayers: autoScaleLayersData,
                        visibleSize: visibleSizeData,
                        forceSize: forceSizeData,
                        autoplayDelay: autoplayDelayData
                    });
                    $(document).on('click', proNext, function () {
                        $proSlider.sliderPro('nextSlide');
                    });
                    $(document).on('click', proPrev, function () {
                        $proSlider.sliderPro('previousSlide');
                    });

                });
            }
        }

    };

    Core.initialize();

})();