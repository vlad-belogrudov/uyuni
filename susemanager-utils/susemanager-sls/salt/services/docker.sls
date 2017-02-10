{% if pillar['addon_group_types'] is defined and 'docker_build_host' in pillar['addon_group_types'] %}
mgr_install_docker:
  pkg.installed:
    - pkgs:
      - docker: '>=1.9.0'
      - python-docker-py: '>=1.6.0'

mgr_docker_service:
  service.running:
    - name: docker
    - enable: True
    - require:
      - pkg: mgr_install_docker

mgr_min_salt:
  pkg.installed:
    - pkgs:
      - salt: '>=2016.11.1'
    - order: last
{% endif %}