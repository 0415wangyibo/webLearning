<template>
  <div id = "test43">
    <button v-on:click = "show = !show">点我</button>
    <transition
      v-on:before-enter="beforeEnter"
      v-on:enter="enter"
      v-on:leave="leave"
      v-bind:css="false"
    >
      <p v-if="show">好好学习，天天向上！！！</p>
    </transition>
  </div>
</template>

<script>
    export default {
      name: "test43",
      data() {
        return{
          show: false
        }
      },
      methods: {
        beforeEnter: function (el) {
          el.style.opacity = 0;
          el.style.transformOrigin = 'left';
        },
        enter: function (el, done) {
          Velocity(el, { opacity: 1, fontSize: '1.4em' }, { duration: 300 });
          Velocity(el, { fontSize: '1em' }, { complete: done });
        },
        leave: function (el, done) {
          Velocity(el, { translateX: '15px', rotateZ: '50deg' }, { duration: 600 });
          Velocity(el, { rotateZ: '100deg' }, { loop: 2 });
          Velocity(el, {
            rotateZ: '45deg',
            translateY: '30px',
            translateX: '30px',
            opacity: 0
          }, { complete: done });
        }
      }
    }
</script>

<style scoped>

</style>
