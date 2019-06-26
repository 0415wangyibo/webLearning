import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld';
import Element82 from '@/components/Element82';
import Element83 from '@/components/Element83';
import Element84 from '@/components/Element84';
import Element85 from '@/components/Element85';
import Element86 from '@/components/Element86';
import Element87 from '@/components/Element87';
import Element88 from '@/components/Element88';
import Element89 from '@/components/Element89';
import Element90 from '@/components/Element90';
import Element91 from '@/components/Element91';
import Element92 from '@/components/Element92';
import Element93 from '@/components/Element93';
import Element94 from '@/components/Element94';
import Element95 from '@/components/Element95';
import Element96 from '@/components/Element96';
import Element97 from '@/components/Element97';
import Element98 from '@/components/Element98';
import Element99 from '@/components/Element99';
import Element100 from '@/components/Element100';
import Element101 from '@/components/Element101';



Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/element82',
      name: 'Element82',
      component: Element82
    },
    {
      path: '/element83',
      name: 'Element83',
      component: Element83
    },
    {
      path: '/element84',
      name: 'Element84',
      component: Element84
    },
    {
      path: '/element85',
      name: 'Element85',
      component: Element85
    },
    {
      path: '/element86',
      name: 'Element86',
      component: Element86
    },
    {
      path: '/element87',
      name: 'Element87',
      component: Element87
    },
    {
      path: '/element88',
      name: 'Element88',
      component: Element88
    },
    {
      path: '/element89',
      name: 'Element89',
      component: Element89
    },
    {
      path: '/element90',
      name: 'Element90',
      component: Element90
    },
    {
      path: '/element91',
      name: 'Element91',
      component: Element91
    },
    {
      path: '/element92',
      name: 'Element92',
      component: Element92
    },
    {
      path: '/element93',
      name: 'Element93',
      component: Element93
    },
    {
      path: '/element94',
      name: 'Element94',
      component: Element94
    },
    {
      path: '/element95',
      name: 'Element95',
      component: Element95
    },
    {
      path: '/element96',
      name: 'Element96',
      component: Element96
    },
    {
      path: '/element97',
      name: 'Element97',
      component: Element97
    },
    {
      path: '/element98',
      name: 'Element98',
      component: Element98
    },
    {
      path: '/element99',
      name: 'Element99',
      component: Element99
    },
    {
      path: '/element100',
      name: 'Element100',
      component: Element100
    },
    {
      path: '/element101',
      name: 'Element101',
      component: Element101
    },
    {
      path: '/*',
      component: HelloWorld,
      redirect: '/'
    }
  ]
})
