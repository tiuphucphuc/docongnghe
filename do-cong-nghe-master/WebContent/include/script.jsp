<script src="https://unpkg.com/swiper@7/swiper-bundle.min.js"></script>
   <script>
   	<%@include file="js.js"%>
   </script>


<script>
    var swiper = new Swiper(".mySwiper", {
        navigation: {
          nextEl: ".swiper-button-next",
          prevEl: ".swiper-button-prev",
        },
      });
  </script>